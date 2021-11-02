package io.github.mall.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.base.Preconditions;
import io.github.mall.admin.dto.UmsAdminParam;
import io.github.mall.admin.exception.BuzzException;
import io.github.mall.admin.mapper.UserMapper;
import io.github.mall.admin.service.UserService;
import io.github.mall.common.api.Const;
import io.github.mall.common.api.Page;
import io.github.mall.persist.entity.UmsAdmin;
import io.github.mall.persist.entity.UmsAdminLoginLog;
import io.github.mall.persist.service.UmsAdminLoginLogService;
import io.github.mall.persist.service.UmsAdminService;
import io.github.mall.security.util.JwtUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    UmsAdminService umsAdminService;
    @Autowired
    UmsAdminLoginLogService umsAdminLoginLogService;
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    UserMapper userMapper;

    @Transactional
    @Override
    public boolean register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setLoginTime(new Date());
        umsAdmin.setStatus(1);
        BuzzException.check(umsAdminService.getOne(new QueryWrapper<UmsAdmin>().eq("login_name", umsAdmin.getLoginName())), "该用户已注册");
        umsAdmin.setPassword(passwordEncoder.encode(umsAdmin.getPassword()));
        return umsAdminService.save(umsAdmin);
    }

    @Transactional
    @Override
    public String login(String loginName, String password) {
        UserDetails userDetails = Preconditions.checkNotNull(userDetailsService.loadUserByUsername(loginName), "用户信息为空");
        //校验密码
        if (!passwordEncoder.matches(password, userDetails.getPassword())) {
            throw new BadCredentialsException("密码不正确");
        }
        //认证授权
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        //生成token
        String token = jwtUtil.generateToken(userDetails);

        UmsAdmin umsAdmin = umsAdminService.getOne(new QueryWrapper<UmsAdmin>().eq("login_name", loginName));
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        UmsAdminLoginLog umsAdminLoginLog = UmsAdminLoginLog.builder()
                .adminId(umsAdmin.getId())
                .ip(request.getRemoteAddr())
                .createTime(new Date())
                .userAgent(request.getHeader(Const.USER_AGENT.getName()))
                .build();
        //插入登录信息
        Preconditions.checkNotNull(umsAdminLoginLogService.save(umsAdminLoginLog), "插入登录信息失败");
        return token;
    }

    @Override
    public String refreshToken(String oldToken, String tokenHead) {
        return jwtUtil.refreshHeadToken(oldToken);
    }

    @Override
    public Page<UmsAdmin> page(String loginName, Integer pageSize, Integer pageNum) {

        Page<UmsAdmin> page = new Page<>();
        Long count = userMapper.count(loginName,pageSize,pageNum-1);
        List<UmsAdmin> datum = userMapper.page(loginName,pageSize,pageNum-1);
        page.setTotal(count);
        page.setList(datum);
        return page;
    }
}

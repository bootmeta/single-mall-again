package io.github.mall.admin.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.base.Preconditions;
import io.github.mall.admin.bo.AdminUserDetails;
import io.github.mall.admin.service.UserRolePermissionService;
import io.github.mall.persist.entity.UmsAdmin;
import io.github.mall.persist.entity.UmsPermission;
import io.github.mall.persist.service.UmsAdminService;
import io.github.mall.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * mall-security模块相关配置
 * Created on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MallSecurityConfig extends SecurityConfig {

    @Autowired
    private UmsAdminService umsAdminService;

    @Autowired
    private UserRolePermissionService userRolePermissionService;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return loginName -> {
            UmsAdmin admin = Preconditions.checkNotNull(umsAdminService.getOne(new QueryWrapper<UmsAdmin>().eq("login_name", loginName)), "未查询到用户");
            List<UmsPermission> permissionList = userRolePermissionService.getPermissionList(admin.getId());
            return new AdminUserDetails(admin, permissionList);
        };
    }


}

package io.github.mall.admin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Maps;
import io.github.bootmeta.result.R;
import io.github.bootmeta.result.Result;
import io.github.mall.admin.dto.UmsAdminLoginParam;
import io.github.mall.admin.dto.UmsAdminParam;
import io.github.mall.admin.exception.BuzzException;
import io.github.mall.admin.service.UserPermissionService;
import io.github.mall.admin.service.UserRoleService;
import io.github.mall.admin.service.UserService;
import io.github.mall.common.anno.CurrentUser;
import io.github.mall.common.api.Const;
import io.github.mall.common.api.Page;
import io.github.mall.common.api.ResultCode;
import io.github.mall.persist.entity.UmsAdmin;
import io.github.mall.persist.entity.UmsRole;
import io.github.mall.persist.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@Api(tags = "UserController", description = "后台用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    UserService userService;
    @Autowired
    UmsAdminService umsAdminService;
    @Autowired
    UserRoleService userRoleService;

    @Autowired
    UserPermissionService userPermissionService;


    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Result register(@RequestBody UmsAdminParam umsAdminParam, BindingResult br) {
        return userService.register(umsAdminParam) ? R.success() : R.fail();
    }

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Result login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult br) {
        String token = userService.login(umsAdminLoginParam.getLoginName(), umsAdminLoginParam.getPassword());
        Map<String, String> tokenInfo = Maps.newHashMap();
        tokenInfo.put("token", token);
        tokenInfo.put("tokenHead", tokenHead);
        return R.success(tokenInfo);
    }


    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refresh/token", method = RequestMethod.POST)
    public Result refresh(@RequestHeader("token") String oldToken) {
        String refreshToken = userService.refreshToken(oldToken, tokenHead);
        Map<String, String> tokenInfo = Maps.newHashMap();
        tokenInfo.put("token", refreshToken);
        tokenInfo.put("tokenHead", tokenHead);
        return StringUtils.isEmpty(refreshToken) ? R.fail(ResultCode.FAILED.getCode(), "token已经过期！") : R.success(tokenInfo);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public Result info(@ApiIgnore Principal principal) {
        UmsAdmin umsAdmin = umsAdminService.getOne(new QueryWrapper<UmsAdmin>().eq("login_name",principal.getName()));
        List<UmsRole> roleList = userRoleService.getRoleList(umsAdmin.getId());
        Map<String, Object> data = Maps.newHashMap();
        data.put("username", umsAdmin.getUsername());
        data.put("loginName", umsAdmin.getLoginName());
        data.put("roles", roleList);
        return R.success(data);
    }


    @ApiOperation("获取指定用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result getItem(@PathVariable Long id,@ApiIgnore @CurrentUser String loginName) {
        UmsAdmin umsAdmin = umsAdminService.getById(id);
        return R.success(umsAdmin);
    }


    @ApiOperation("修改指定用户信息")
    @RequestMapping(value = "/modify/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@PathVariable Long id, @RequestBody UmsAdmin umsAdmin) {
        boolean result = umsAdminService.update(umsAdmin, new QueryWrapper<UmsAdmin>().eq("id", id));
        return result ? R.success() : R.fail();
    }

    @ApiOperation("删除指定用户信息")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@PathVariable Long id) {
        final UmsAdmin umsAdmin = umsAdminService.getOne(new QueryWrapper<UmsAdmin>().eq("id", id));
        if(org.apache.commons.lang3.StringUtils.equals(Const.SYS_ADMIN.getName(),umsAdmin.getLoginName())){
            throw new BuzzException("该用户"+Const.SYS_ADMIN.getName()+"不能删除");
        }

        boolean result = umsAdminService.removeById(id);
        return result ? R.success() : R.fail();
    }


    @ApiOperation("给用户分配角色")
    @RequestMapping(value = "/role/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Result getRoleList(@PathVariable("id")Long userId,@RequestParam("rids") List<Long> roleIds){
        userRoleService.updateUserRole(userId,roleIds);
        return R.success();
    }

    @ApiOperation("获取指定用户的角色")
    @RequestMapping(value = "/role/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public Result getRoleList(@PathVariable Long adminId) {
        List<UmsRole> roleList = userRoleService.getRoleList(adminId);
        return R.success(roleList);
    }

    @ApiOperation("给用户分配+-权限")
    @RequestMapping(value = "/permission/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result assginPermission(@PathVariable Long id,@RequestParam("permissionIds")List<Long> permissionIds){
        userPermissionService.updatePermission(id,permissionIds);
        return R.success();
    }

    @ApiOperation("根据用户名或姓名分页获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Result list(@RequestParam(value = "keyword", required = false) String keyword,
                       @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        Page<UmsAdmin> page = userService.page(keyword, pageSize, pageNum);
        return R.success(page);
    }


    @ApiOperation("更新状态")
    @RequestMapping(value = "/updateStatus/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result updateStatus(@PathVariable("id")Long id,@RequestParam("status") Integer status){
        boolean b = umsAdminService.updateById(UmsAdmin.builder().id(id).status(status).build());
        return b ? R.success():R.fail();
    }
}

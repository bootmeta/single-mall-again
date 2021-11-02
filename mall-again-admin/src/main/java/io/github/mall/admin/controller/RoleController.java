package io.github.mall.admin.controller;


import io.github.bootmeta.result.R;
import io.github.bootmeta.result.Result;
import io.github.mall.admin.service.RoleService;
import io.github.mall.common.api.Page;
import io.github.mall.persist.entity.UmsAdmin;
import io.github.mall.persist.entity.UmsRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "RoleController", description = "后台角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {


    @Autowired
    RoleService roleService;

    @ApiOperation("根据用户名或姓名分页获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Result list(@RequestParam(value = "keyword", required = false) String keyword,
                       @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        Page<UmsRole> page = roleService.page(keyword, pageSize, pageNum-1);
        return R.success(page);
    }
}

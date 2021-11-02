package io.github.mall.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import io.github.mall.admin.mapper.UserRoleMapper;
import io.github.mall.admin.service.UserRolePermissionService;
import io.github.mall.admin.service.UserRoleService;
import io.github.mall.persist.entity.UmsAdminRoleRelation;
import io.github.mall.persist.entity.UmsRole;
import io.github.mall.persist.service.UmsAdminPermissionRelationService;
import io.github.mall.persist.service.UmsAdminRoleRelationService;
import io.github.mall.persist.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UmsAdminRoleRelationService umsAdminRoleRelationService;

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    @Autowired
    UmsPermissionService umsPermissionService;

    @Autowired
    UserRolePermissionService userRolePermissionService;

    @Override
    public void updateUserRole(Long userId, List<Long> roleIds) {
        //删除关系
        umsAdminRoleRelationService.remove(new QueryWrapper<UmsAdminRoleRelation>().eq("admin_id", userId));
        List<UmsAdminRoleRelation> datum = Lists.newArrayList();
        //roleIds不为空建立关系
        roleIds.forEach(e -> {
            UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();
            umsAdminRoleRelation.setRoleId(e);
            umsAdminRoleRelation.setAdminId(userId);
            datum.add(umsAdminRoleRelation);
        });
        umsAdminRoleRelationService.saveBatch(datum);
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return userRoleMapper.getRoleList(adminId);
    }


}

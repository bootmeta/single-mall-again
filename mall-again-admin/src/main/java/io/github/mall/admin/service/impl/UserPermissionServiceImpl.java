package io.github.mall.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import io.github.mall.admin.service.UserPermissionService;
import io.github.mall.admin.service.UserRolePermissionService;
import io.github.mall.persist.entity.UmsAdminPermissionRelation;
import io.github.mall.persist.entity.UmsPermission;
import io.github.mall.persist.service.UmsAdminPermissionRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserPermissionServiceImpl implements UserPermissionService {

    @Autowired
    UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    @Autowired
    UserRolePermissionService userRolePermissionService;

    @Override
    public void updatePermission(Long adminId, List<Long> permissionIds) {
        //删除关系
        umsAdminPermissionRelationService.remove(new QueryWrapper<UmsAdminPermissionRelation>().eq("admin_id",adminId));
        //建立关系
        List<UmsAdminPermissionRelation> relationList = Lists.newArrayList();
        List<UmsPermission> rolePermissionList = userRolePermissionService.getRolePermissionList(adminId);
        List<Long> rolePermissionLists =  rolePermissionList.stream().map(UmsPermission::getId).collect(Collectors.toList());

        //筛选出+权限
        List<Long> addPermissionIdList = permissionIds.stream().filter(permissionId -> !rolePermissionList.contains(permissionId)).collect(Collectors.toList());
        //筛选出-权限
        List<Long> subPermissionIdList = rolePermissionLists.stream().filter(permissionId -> !permissionIds.contains(permissionId)).collect(Collectors.toList());
        //插入+-权限关系
        relationList.addAll(convert(adminId,1,addPermissionIdList));
        relationList.addAll(convert(adminId,-1,subPermissionIdList));
        umsAdminPermissionRelationService.saveBatch(relationList);
    }

    private List<UmsAdminPermissionRelation> convert(Long adminId,Integer type,List<Long> permissionIdList) {
        List<UmsAdminPermissionRelation> relationList = permissionIdList.stream().map(permissionId -> {
            UmsAdminPermissionRelation relation = new UmsAdminPermissionRelation();
            relation.setAdminId(adminId);
            relation.setType(type);
            relation.setPermissionId(permissionId);
            return relation;
        }).collect(Collectors.toList());
        return relationList;
    }
}

package io.github.mall.admin.service.impl;

import io.github.mall.admin.mapper.UserRolePermissionMapper;
import io.github.mall.admin.service.UserRolePermissionService;
import io.github.mall.persist.entity.UmsPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolePermissionServiceImpl implements UserRolePermissionService {

    @Autowired
    UserRolePermissionMapper userRolePermissionMapper;

    @Override
    public List<UmsPermission> getPermissionList(long adminId) {
        return userRolePermissionMapper.getPermissionList(adminId);
    }

    @Override
    public List<UmsPermission> getRolePermissionList(Long adminId) {
        return userRolePermissionMapper.getRolePermissionList(adminId);
    }
}

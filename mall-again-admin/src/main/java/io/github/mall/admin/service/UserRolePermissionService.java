package io.github.mall.admin.service;

import io.github.mall.persist.entity.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRolePermissionService {

    List<UmsPermission> getPermissionList(long adminId);

    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);
}

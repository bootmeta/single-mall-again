package io.github.mall.admin.mapper;

import io.github.mall.persist.entity.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRolePermissionMapper {

    List<UmsPermission> getPermissionList(long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);
}

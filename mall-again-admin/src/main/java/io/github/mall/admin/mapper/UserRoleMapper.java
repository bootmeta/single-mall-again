package io.github.mall.admin.mapper;

import io.github.mall.persist.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper {

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
}

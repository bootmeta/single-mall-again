package io.github.mall.admin.mapper;

import io.github.mall.persist.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    long count(@Param("roleName") String keyword, @Param("pageSize")Integer pageSize, @Param("pageNum")Integer pageNum);

    List<UmsRole> page(@Param("roleName")String keyword, @Param("pageSize")Integer pageSize, @Param("pageNum")Integer pageNum);
}

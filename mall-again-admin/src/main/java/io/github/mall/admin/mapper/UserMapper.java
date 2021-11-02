package io.github.mall.admin.mapper;

import io.github.mall.persist.entity.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    Long count(@Param("loginName") String loginName, @Param("pageSize")Integer pageSize, @Param("pageNum")Integer pageNum);

    List<UmsAdmin> page(@Param("loginName")String loginName, @Param("pageSize")Integer pageSize, @Param("pageNum")Integer pageNum);
}

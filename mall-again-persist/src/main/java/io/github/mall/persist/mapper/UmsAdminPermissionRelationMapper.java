package io.github.mall.persist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.mall.persist.entity.UmsAdminPermissionRelation;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {

}
package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsAdminPermissionRelation;
import io.github.mall.persist.mapper.UmsAdminPermissionRelationMapper;
import io.github.mall.persist.service.UmsAdminPermissionRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

}
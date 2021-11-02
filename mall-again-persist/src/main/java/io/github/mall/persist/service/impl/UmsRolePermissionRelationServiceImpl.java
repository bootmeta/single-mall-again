package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsRolePermissionRelation;
import io.github.mall.persist.mapper.UmsRolePermissionRelationMapper;
import io.github.mall.persist.service.UmsRolePermissionRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsRolePermissionRelationServiceImpl extends ServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation> implements UmsRolePermissionRelationService {

}
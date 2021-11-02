package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsAdminRoleRelation;
import io.github.mall.persist.mapper.UmsAdminRoleRelationMapper;
import io.github.mall.persist.service.UmsAdminRoleRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsAdminRoleRelationServiceImpl extends ServiceImpl<UmsAdminRoleRelationMapper, UmsAdminRoleRelation> implements UmsAdminRoleRelationService {

}
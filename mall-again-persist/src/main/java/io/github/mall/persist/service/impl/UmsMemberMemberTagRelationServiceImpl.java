package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberMemberTagRelation;
import io.github.mall.persist.mapper.UmsMemberMemberTagRelationMapper;
import io.github.mall.persist.service.UmsMemberMemberTagRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户和标签关系表(UmsMemberMemberTagRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberMemberTagRelationServiceImpl extends ServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation> implements UmsMemberMemberTagRelationService {

}
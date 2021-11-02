package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberProductCategoryRelation;
import io.github.mall.persist.mapper.UmsMemberProductCategoryRelationMapper;
import io.github.mall.persist.service.UmsMemberProductCategoryRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员与产品分类关系表（用户喜欢的分类）(UmsMemberProductCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements UmsMemberProductCategoryRelationService {

}
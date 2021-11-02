package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductCategoryAttributeRelation;
import io.github.mall.persist.mapper.PmsProductCategoryAttributeRelationMapper;
import io.github.mall.persist.service.PmsProductCategoryAttributeRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）(PmsProductCategoryAttributeRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

}
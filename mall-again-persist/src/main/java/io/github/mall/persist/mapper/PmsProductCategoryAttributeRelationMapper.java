package io.github.mall.persist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.mall.persist.entity.PmsProductCategoryAttributeRelation;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）(PmsProductCategoryAttributeRelation)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
public interface PmsProductCategoryAttributeRelationMapper extends BaseMapper<PmsProductCategoryAttributeRelation> {

}
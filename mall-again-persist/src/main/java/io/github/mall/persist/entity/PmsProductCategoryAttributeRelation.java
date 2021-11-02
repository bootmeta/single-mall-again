package io.github.mall.persist.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）(PmsProductCategoryAttributeRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_category_attribute_relation")
public class PmsProductCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 292575548817506292L;

    @TableId
    private Long id;

    @TableField("product_category_id")
    private Long productCategoryId;

    @TableField("product_attribute_id")
    private Long productAttributeId;


}
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
 * 产品属性分类表(PmsProductAttributeCategory)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_attribute_category")
public class PmsProductAttributeCategory implements Serializable {

    private static final long serialVersionUID = -14830180309400720L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 属性数量
     */
    @TableField("attribute_count")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField("param_count")
    private Integer paramCount;


}
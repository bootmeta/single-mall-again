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
 * 产品分类(PmsProductCategory)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_category")
public class PmsProductCategory implements Serializable {

    private static final long serialVersionUID = 966453054652993640L;

    @TableId
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField("parent_id")
    private Long parentId;

    @TableField("name")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField("level")
    private Integer level;

    @TableField("product_count")
    private Integer productCount;

    @TableField("product_unit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField("nav_status")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField("show_status")
    private Integer showStatus;

    @TableField("sort")
    private Integer sort;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    @TableField("keywords")
    private String keywords;

    /**
     * 描述
     */
    @TableField("description")
    private String description;


}
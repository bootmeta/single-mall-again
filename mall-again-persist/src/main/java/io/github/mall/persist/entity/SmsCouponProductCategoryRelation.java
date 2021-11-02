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
 * 优惠券和产品分类关系表(SmsCouponProductCategoryRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_coupon_product_category_relation")
public class SmsCouponProductCategoryRelation implements Serializable {

    private static final long serialVersionUID = 960333548379199722L;

    @TableId
    private Long id;

    @TableField("coupon_id")
    private Long couponId;

    @TableField("product_category_id")
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    @TableField("product_category_name")
    private String productCategoryName;

    /**
     * 父分类名称
     */
    @TableField("parent_category_name")
    private String parentCategoryName;


}
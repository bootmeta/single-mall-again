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
 * 优惠券和产品的关系表(SmsCouponProductRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_coupon_product_relation")
public class SmsCouponProductRelation implements Serializable {

    private static final long serialVersionUID = -31518164125143693L;

    @TableId
    private Long id;

    @TableField("coupon_id")
    private Long couponId;

    @TableField("product_id")
    private Long productId;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 商品编码
     */
    @TableField("product_sn")
    private String productSn;


}
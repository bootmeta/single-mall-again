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
 * 订单中所包含的商品(OmsOrderItem)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_item")
public class OmsOrderItem implements Serializable {

    private static final long serialVersionUID = 889859201388247669L;

    @TableId
    private Long id;

    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;

    @TableField("product_id")
    private Long productId;

    @TableField("product_pic")
    private String productPic;

    @TableField("product_name")
    private String productName;

    @TableField("product_brand")
    private String productBrand;

    @TableField("product_sn")
    private String productSn;

    /**
     * 销售价格
     */
    @TableField("product_price")
    private Double productPrice;

    /**
     * 购买数量
     */
    @TableField("product_quantity")
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    @TableField("product_sku_id")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @TableField("product_sku_code")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @TableField("product_category_id")
    private Long productCategoryId;

    /**
     * 商品的销售属性
     */
    @TableField("sp1")
    private String sp1;

    @TableField("sp2")
    private String sp2;

    @TableField("sp3")
    private String sp3;

    /**
     * 商品促销名称
     */
    @TableField("promotion_name")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @TableField("promotion_amount")
    private Double promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @TableField("coupon_amount")
    private Double couponAmount;

    /**
     * 积分优惠分解金额
     */
    @TableField("integration_amount")
    private Double integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @TableField("real_amount")
    private Double realAmount;

    @TableField("gift_integration")
    private Integer giftIntegration;

    @TableField("gift_growth")
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField("product_attr")
    private String productAttr;


}
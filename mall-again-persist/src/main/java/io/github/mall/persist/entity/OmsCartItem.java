package io.github.mall.persist.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * 购物车表(OmsCartItem)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_cart_item")
public class OmsCartItem implements Serializable {

    private static final long serialVersionUID = 329343293941810707L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("product_sku_id")
    private Long productSkuId;

    @TableField("member_id")
    private Long memberId;

    /**
     * 购买数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    @TableField("price")
    private Double price;

    /**
     * 销售属性1
     */
    @TableField("sp1")
    private String sp1;

    /**
     * 销售属性2
     */
    @TableField("sp2")
    private String sp2;

    /**
     * 销售属性3
     */
    @TableField("sp3")
    private String sp3;

    /**
     * 商品主图
     */
    @TableField("product_pic")
    private String productPic;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 商品副标题（卖点）
     */
    @TableField("product_sub_title")
    private String productSubTitle;

    /**
     * 商品sku条码
     */
    @TableField("product_sku_code")
    private String productSkuCode;

    /**
     * 会员昵称
     */
    @TableField("member_nickname")
    private String memberNickname;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField("modify_date")
    private Date modifyDate;

    /**
     * 是否删除
     */
    @TableField("delete_status")
    private Integer deleteStatus;

    /**
     * 商品分类
     */
    @TableField("product_category_id")
    private Long productCategoryId;

    @TableField("product_brand")
    private String productBrand;

    @TableField("product_sn")
    private String productSn;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField("product_attr")
    private String productAttr;


}
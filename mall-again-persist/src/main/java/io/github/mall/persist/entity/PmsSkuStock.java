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
 * sku的库存(PmsSkuStock)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_sku_stock")
public class PmsSkuStock implements Serializable {

    private static final long serialVersionUID = -15360697764050758L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    /**
     * sku编码
     */
    @TableField("sku_code")
    private String skuCode;

    @TableField("price")
    private Double price;

    /**
     * 库存
     */
    @TableField("stock")
    private Integer stock;

    /**
     * 预警库存
     */
    @TableField("low_stock")
    private Integer lowStock;

    /**
     * 销售属性1
     */
    @TableField("sp1")
    private String sp1;

    @TableField("sp2")
    private String sp2;

    @TableField("sp3")
    private String sp3;

    /**
     * 展示图片
     */
    @TableField("pic")
    private String pic;

    /**
     * 销量
     */
    @TableField("sale")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @TableField("promotion_price")
    private Double promotionPrice;

    /**
     * 锁定库存
     */
    @TableField("lock_stock")
    private Integer lockStock;


}
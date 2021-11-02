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
 * 产品阶梯价格表(只针对同商品)(PmsProductLadder)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_ladder")
public class PmsProductLadder implements Serializable {

    private static final long serialVersionUID = -44795060838388187L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    /**
     * 满足的商品数量
     */
    @TableField("count")
    private Integer count;

    /**
     * 折扣
     */
    @TableField("discount")
    private Double discount;

    /**
     * 折后价格
     */
    @TableField("price")
    private Double price;


}
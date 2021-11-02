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
 * 产品满减表(只针对同商品)(PmsProductFullReduction)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_full_reduction")
public class PmsProductFullReduction implements Serializable {

    private static final long serialVersionUID = -56762330719176998L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("full_price")
    private Double fullPrice;

    @TableField("reduce_price")
    private Double reducePrice;


}
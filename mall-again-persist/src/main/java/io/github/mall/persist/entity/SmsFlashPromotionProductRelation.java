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
 * 商品限时购与商品关系表(SmsFlashPromotionProductRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID = -68713617469682351L;

    /**
     * 编号
     */
    @TableId
    private Long id;

    @TableField("flash_promotion_id")
    private Long flashPromotionId;

    /**
     * 编号
     */
    @TableField("flash_promotion_session_id")
    private Long flashPromotionSessionId;

    @TableField("product_id")
    private Long productId;

    /**
     * 限时购价格
     */
    @TableField("flash_promotion_price")
    private Double flashPromotionPrice;

    /**
     * 限时购数量
     */
    @TableField("flash_promotion_count")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @TableField("flash_promotion_limit")
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


}
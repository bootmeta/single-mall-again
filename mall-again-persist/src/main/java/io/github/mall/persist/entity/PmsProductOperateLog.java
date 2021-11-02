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
 * (PmsProductOperateLog)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_operate_log")
public class PmsProductOperateLog implements Serializable {

    private static final long serialVersionUID = -80537824290937419L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("price_old")
    private Double priceOld;

    @TableField("price_new")
    private Double priceNew;

    @TableField("sale_price_old")
    private Double salePriceOld;

    @TableField("sale_price_new")
    private Double salePriceNew;

    /**
     * 赠送的积分
     */
    @TableField("gift_point_old")
    private Integer giftPointOld;

    @TableField("gift_point_new")
    private Integer giftPointNew;

    @TableField("use_point_limit_old")
    private Integer usePointLimitOld;

    @TableField("use_point_limit_new")
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    @TableField("operate_man")
    private String operateMan;

    @TableField("create_time")
    private Date createTime;


}
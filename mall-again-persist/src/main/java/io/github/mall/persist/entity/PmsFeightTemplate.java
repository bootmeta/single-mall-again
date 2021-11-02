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
 * 运费模版(PmsFeightTemplate)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_feight_template")
public class PmsFeightTemplate implements Serializable {

    private static final long serialVersionUID = -58992494185201778L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    @TableField("charge_type")
    private Integer chargeType;

    /**
     * 首重kg
     */
    @TableField("first_weight")
    private Double firstWeight;

    /**
     * 首费（元）
     */
    @TableField("first_fee")
    private Double firstFee;

    @TableField("continue_weight")
    private Double continueWeight;

    @TableField("continme_fee")
    private Double continmeFee;

    /**
     * 目的地（省、市）
     */
    @TableField("dest")
    private String dest;


}
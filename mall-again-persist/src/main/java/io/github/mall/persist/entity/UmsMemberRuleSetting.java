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
 * 会员积分成长规则表(UmsMemberRuleSetting)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_rule_setting")
public class UmsMemberRuleSetting implements Serializable {

    private static final long serialVersionUID = 578935943197981012L;

    @TableId
    private Long id;

    /**
     * 连续签到天数
     */
    @TableField("continue_sign_day")
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    @TableField("continue_sign_point")
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    @TableField("consume_per_point")
    private Double consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    @TableField("low_order_amount")
    private Double lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    @TableField("max_point_per_order")
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    @TableField("type")
    private Integer type;


}
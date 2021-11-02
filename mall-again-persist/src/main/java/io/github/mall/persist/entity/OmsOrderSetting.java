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
 * 订单设置表(OmsOrderSetting)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_setting")
public class OmsOrderSetting implements Serializable {

    private static final long serialVersionUID = 936672978759903735L;

    @TableId
    private Long id;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    @TableField("flash_order_overtime")
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    @TableField("normal_order_overtime")
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    @TableField("confirm_overtime")
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请售后（天）
     */
    @TableField("finish_overtime")
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    @TableField("comment_overtime")
    private Integer commentOvertime;


}
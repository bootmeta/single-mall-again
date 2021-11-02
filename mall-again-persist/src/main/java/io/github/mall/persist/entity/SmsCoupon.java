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
 * 优惠卷表(SmsCoupon)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_coupon")
public class SmsCoupon implements Serializable {

    private static final long serialVersionUID = -12028091335019861L;

    @TableId
    private Long id;

    /**
     * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    @TableField("type")
    private Integer type;

    @TableField("name")
    private String name;

    /**
     * 使用平台：0->全部；1->移动；2->PC
     */
    @TableField("platform")
    private Integer platform;

    /**
     * 数量
     */
    @TableField("count")
    private Integer count;

    /**
     * 金额
     */
    @TableField("amount")
    private Double amount;

    /**
     * 每人限领张数
     */
    @TableField("per_limit")
    private Integer perLimit;

    /**
     * 使用门槛；0表示无门槛
     */
    @TableField("min_point")
    private Double minPoint;

    @TableField("start_time")
    private Date startTime;

    @TableField("end_time")
    private Date endTime;

    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    @TableField("use_type")
    private Integer useType;

    /**
     * 备注
     */
    @TableField("note")
    private String note;

    /**
     * 发行数量
     */
    @TableField("publish_count")
    private Integer publishCount;

    /**
     * 已使用数量
     */
    @TableField("use_count")
    private Integer useCount;

    /**
     * 领取数量
     */
    @TableField("receive_count")
    private Integer receiveCount;

    /**
     * 可以领取的日期
     */
    @TableField("enable_time")
    private Date enableTime;

    /**
     * 优惠码
     */
    @TableField("code")
    private String code;

    /**
     * 可领取的会员类型：0->无限时
     */
    @TableField("member_level")
    private Integer memberLevel;


}
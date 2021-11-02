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
 * 首页轮播广告表(SmsHomeAdvertise)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_advertise")
public class SmsHomeAdvertise implements Serializable {

    private static final long serialVersionUID = -35474493506236289L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 轮播位置：0->PC首页轮播；1->app首页轮播
     */
    @TableField("type")
    private Integer type;

    @TableField("pic")
    private String pic;

    @TableField("start_time")
    private Date startTime;

    @TableField("end_time")
    private Date endTime;

    /**
     * 上下线状态：0->下线；1->上线
     */
    @TableField("status")
    private Integer status;

    /**
     * 点击数
     */
    @TableField("click_count")
    private Integer clickCount;

    /**
     * 下单数
     */
    @TableField("order_count")
    private Integer orderCount;

    /**
     * 链接地址
     */
    @TableField("url")
    private String url;

    /**
     * 备注
     */
    @TableField("note")
    private String note;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


}
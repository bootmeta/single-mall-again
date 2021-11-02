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
 * 限时购表(SmsFlashPromotion)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_flash_promotion")
public class SmsFlashPromotion implements Serializable {

    private static final long serialVersionUID = 965244914024058890L;

    @TableId
    private Long id;

    @TableField("title")
    private String title;

    /**
     * 开始日期
     */
    @TableField("start_date")
    private Object startDate;

    /**
     * 结束日期
     */
    @TableField("end_date")
    private Object endDate;

    /**
     * 上下线状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    @TableField("create_time")
    private Date createTime;


}
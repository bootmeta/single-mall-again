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
 * 限时购场次表(SmsFlashPromotionSession)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_flash_promotion_session")
public class SmsFlashPromotionSession implements Serializable {

    private static final long serialVersionUID = -59962248469482208L;

    /**
     * 编号
     */
    @TableId
    private Long id;

    /**
     * 场次名称
     */
    @TableField("name")
    private String name;

    /**
     * 每日开始时间
     */
    @TableField("start_time")
    private Object startTime;

    /**
     * 每日结束时间
     */
    @TableField("end_time")
    private Object endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    @TableField("status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


}
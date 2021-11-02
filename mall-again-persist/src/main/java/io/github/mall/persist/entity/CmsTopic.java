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
 * 话题表(CmsTopic)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_topic")
public class CmsTopic implements Serializable {

    private static final long serialVersionUID = -14147917359782183L;

    @TableId
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("name")
    private String name;

    @TableField("create_time")
    private Date createTime;

    @TableField("start_time")
    private Date startTime;

    @TableField("end_time")
    private Date endTime;

    /**
     * 参与人数
     */
    @TableField("attend_count")
    private Integer attendCount;

    /**
     * 关注人数
     */
    @TableField("attention_count")
    private Integer attentionCount;

    @TableField("read_count")
    private Integer readCount;

    /**
     * 奖品名称
     */
    @TableField("award_name")
    private String awardName;

    /**
     * 参与方式
     */
    @TableField("attend_type")
    private String attendType;

    /**
     * 话题内容
     */
    @TableField("content")
    private String content;


}
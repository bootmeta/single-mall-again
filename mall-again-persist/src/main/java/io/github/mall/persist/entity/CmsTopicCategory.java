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
 * 话题分类表(CmsTopicCategory)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_topic_category")
public class CmsTopicCategory implements Serializable {

    private static final long serialVersionUID = 282519688752359544L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 分类图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 专题数量
     */
    @TableField("subject_count")
    private Integer subjectCount;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("sort")
    private Integer sort;


}
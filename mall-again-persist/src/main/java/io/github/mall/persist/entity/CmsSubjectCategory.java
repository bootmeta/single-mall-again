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
 * 专题分类表(CmsSubjectCategory)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_subject_category")
public class CmsSubjectCategory implements Serializable {

    private static final long serialVersionUID = -22913080912353038L;

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
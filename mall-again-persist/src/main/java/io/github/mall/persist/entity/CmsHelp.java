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
 * 帮助表(CmsHelp)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:07
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_help")
public class CmsHelp implements Serializable {

    private static final long serialVersionUID = -19725539349024114L;

    @TableId
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("icon")
    private String icon;

    @TableField("title")
    private String title;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("create_time")
    private Date createTime;

    @TableField("read_count")
    private Integer readCount;

    @TableField("content")
    private String content;


}
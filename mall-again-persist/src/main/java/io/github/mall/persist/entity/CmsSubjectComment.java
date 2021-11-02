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
 * 专题评论表(CmsSubjectComment)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_subject_comment")
public class CmsSubjectComment implements Serializable {

    private static final long serialVersionUID = 412129457721193470L;

    @TableId
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    @TableField("member_nick_name")
    private String memberNickName;

    @TableField("member_icon")
    private String memberIcon;

    @TableField("content")
    private String content;

    @TableField("create_time")
    private Date createTime;

    @TableField("show_status")
    private Integer showStatus;


}
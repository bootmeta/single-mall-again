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
 * 用户和标签关系表(UmsMemberMemberTagRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_member_tag_relation")
public class UmsMemberMemberTagRelation implements Serializable {

    private static final long serialVersionUID = -53621121537652075L;

    @TableId
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("tag_id")
    private Long tagId;


}
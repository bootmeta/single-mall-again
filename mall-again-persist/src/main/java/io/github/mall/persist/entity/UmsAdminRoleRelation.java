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
 * 后台用户和角色关系表(UmsAdminRoleRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_admin_role_relation")
public class UmsAdminRoleRelation implements Serializable {

    private static final long serialVersionUID = -35760105441320980L;

    @TableId
    private Long id;

    @TableField("admin_id")
    private Long adminId;

    @TableField("role_id")
    private Long roleId;


}
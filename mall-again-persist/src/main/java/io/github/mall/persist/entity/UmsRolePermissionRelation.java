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
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_role_permission_relation")
public class UmsRolePermissionRelation implements Serializable {

    private static final long serialVersionUID = 739928755987292273L;

    @TableId
    private Long id;

    @TableField("role_id")
    private Long roleId;

    @TableField("permission_id")
    private Long permissionId;


}
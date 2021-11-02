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
 * 后台用户权限表(UmsPermission)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_permission")
public class UmsPermission implements Serializable {

    private static final long serialVersionUID = 647918976391769543L;

    @TableId
    private Long id;

    /**
     * 父级权限id
     */
    @TableField("pid")
    private Long pid;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 权限值
     */
    @TableField("value")
    private String value;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @TableField("type")
    private Integer type;

    /**
     * 前端资源路径
     */
    @TableField("uri")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @TableField("status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


}
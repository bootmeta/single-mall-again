package io.github.mall.persist.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 后台用户表(UmsAdmin)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_admin")
public class UmsAdmin implements Serializable {

    private static final long serialVersionUID = -97639833304831575L;

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("login_name")
    private String loginName;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    /**
     * 头像
     */
    @TableField("icon")
    private String icon;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 备注信息
     */
    @TableField("note")
    private String note;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("login_time")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @TableField("status")
    private Integer status;


}
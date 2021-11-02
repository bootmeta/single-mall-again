package io.github.mall.persist.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * 后台用户登录日志表(UmsAdminLoginLog)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_admin_login_log")
public class UmsAdminLoginLog implements Serializable {

    private static final long serialVersionUID = -87113394454235822L;

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("admin_id")
    private Long adminId;

    @TableField("create_time")
    private Date createTime;

    @TableField("ip")
    private String ip;

    @TableField("address")
    private String address;

    /**
     * 浏览器登录类型
     */
    @TableField("user_agent")
    private String userAgent;


}
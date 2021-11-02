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
 * 会员登录记录(UmsMemberLoginLog)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_login_log")
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID = -94834540532335246L;

    @TableId
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("create_time")
    private Date createTime;

    @TableField("ip")
    private String ip;

    @TableField("city")
    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @TableField("login_type")
    private Integer loginType;

    @TableField("province")
    private String province;


}
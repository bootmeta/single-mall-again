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
 * 会员表(UmsMember)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member")
public class UmsMember implements Serializable {

    private static final long serialVersionUID = -83371794177254451L;

    @TableId
    private Long id;

    @TableField("member_level_id")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @TableField("status")
    private Integer status;

    /**
     * 注册时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 头像
     */
    @TableField("icon")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 生日
     */
    @TableField("birthday")
    private Object birthday;

    /**
     * 所做城市
     */
    @TableField("city")
    private String city;

    /**
     * 职业
     */
    @TableField("job")
    private String job;

    /**
     * 个性签名
     */
    @TableField("personalized_signature")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @TableField("source_type")
    private Integer sourceType;

    /**
     * 积分
     */
    @TableField("integration")
    private Integer integration;

    /**
     * 成长值
     */
    @TableField("growth")
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    @TableField("luckey_count")
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    @TableField("history_integration")
    private Integer historyIntegration;


}
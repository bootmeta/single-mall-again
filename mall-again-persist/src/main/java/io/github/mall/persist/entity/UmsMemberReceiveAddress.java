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
 * 会员收货地址表(UmsMemberReceiveAddress)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_receive_address")
public class UmsMemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 912165808078958948L;

    @TableId
    private Long id;

    @TableField("member_id")
    private Long memberId;

    /**
     * 收货人名称
     */
    @TableField("name")
    private String name;

    @TableField("phone_number")
    private String phoneNumber;

    /**
     * 是否为默认
     */
    @TableField("default_status")
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    @TableField("post_code")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @TableField("province")
    private String province;

    /**
     * 城市
     */
    @TableField("city")
    private String city;

    /**
     * 区
     */
    @TableField("region")
    private String region;

    /**
     * 详细地址(街道)
     */
    @TableField("detail_address")
    private String detailAddress;


}
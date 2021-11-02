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
 * 公司收发货地址表(OmsCompanyAddress)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_company_address")
public class OmsCompanyAddress implements Serializable {

    private static final long serialVersionUID = -35249745214541545L;

    @TableId
    private Long id;

    /**
     * 地址名称
     */
    @TableField("address_name")
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    @TableField("send_status")
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    @TableField("receive_status")
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     */
    @TableField("name")
    private String name;

    /**
     * 收货人电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 省/直辖市
     */
    @TableField("province")
    private String province;

    /**
     * 市
     */
    @TableField("city")
    private String city;

    /**
     * 区
     */
    @TableField("region")
    private String region;

    /**
     * 详细地址
     */
    @TableField("detail_address")
    private String detailAddress;


}
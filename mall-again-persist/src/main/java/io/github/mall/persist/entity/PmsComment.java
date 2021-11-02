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
 * 商品评价表(PmsComment)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_comment")
public class PmsComment implements Serializable {

    private static final long serialVersionUID = -94149438104571193L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("member_nick_name")
    private String memberNickName;

    @TableField("product_name")
    private String productName;

    /**
     * 评价星数：0->5
     */
    @TableField("star")
    private Integer star;

    /**
     * 评价的ip
     */
    @TableField("member_ip")
    private String memberIp;

    @TableField("create_time")
    private Date createTime;

    @TableField("show_status")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @TableField("product_attribute")
    private String productAttribute;

    @TableField("collect_couont")
    private Integer collectCouont;

    @TableField("read_count")
    private Integer readCount;

    @TableField("content")
    private String content;

    /**
     * 上传图片地址，以逗号隔开
     */
    @TableField("pics")
    private String pics;

    /**
     * 评论用户头像
     */
    @TableField("member_icon")
    private String memberIcon;

    @TableField("replay_count")
    private Integer replayCount;


}
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
 * 会员等级表(UmsMemberLevel)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_level")
public class UmsMemberLevel implements Serializable {

    private static final long serialVersionUID = -49311122898435646L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("growth_point")
    private Integer growthPoint;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    @TableField("default_status")
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    @TableField("free_freight_point")
    private Double freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @TableField("comment_growth_point")
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @TableField("priviledge_free_freight")
    private Integer priviledgeFreeFreight;

    /**
     * 是否有签到特权
     */
    @TableField("priviledge_sign_in")
    private Integer priviledgeSignIn;

    /**
     * 是否有评论获奖励特权
     */
    @TableField("priviledge_comment")
    private Integer priviledgeComment;

    /**
     * 是否有专享活动特权
     */
    @TableField("priviledge_promotion")
    private Integer priviledgePromotion;

    /**
     * 是否有会员价格特权
     */
    @TableField("priviledge_member_price")
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @TableField("priviledge_birthday")
    private Integer priviledgeBirthday;

    @TableField("note")
    private String note;


}
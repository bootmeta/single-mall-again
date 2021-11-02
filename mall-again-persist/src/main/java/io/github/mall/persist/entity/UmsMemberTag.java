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
 * 用户标签表(UmsMemberTag)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_tag")
public class UmsMemberTag implements Serializable {

    private static final long serialVersionUID = -65526302958933655L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    @TableField("finish_order_count")
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    @TableField("finish_order_amount")
    private Double finishOrderAmount;


}
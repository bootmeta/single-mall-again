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
 * 退货原因表(OmsOrderReturnReason)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_return_reason")
public class OmsOrderReturnReason implements Serializable {

    private static final long serialVersionUID = 379039106739115694L;

    @TableId
    private Long id;

    /**
     * 退货类型
     */
    @TableField("name")
    private String name;

    @TableField("sort")
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    @TableField("status")
    private Integer status;

    /**
     * 添加时间
     */
    @TableField("create_time")
    private Date createTime;


}
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
 * 商品审核记录(PmsProductVertifyRecord)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_vertify_record")
public class PmsProductVertifyRecord implements Serializable {

    private static final long serialVersionUID = -33501609988404635L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("create_time")
    private Date createTime;

    /**
     * 审核人
     */
    @TableField("vertify_man")
    private String vertifyMan;

    @TableField("status")
    private Integer status;

    /**
     * 反馈详情
     */
    @TableField("detail")
    private String detail;


}
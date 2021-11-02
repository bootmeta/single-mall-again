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
 * 新鲜好物表(SmsHomeNewProduct)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_new_product")
public class SmsHomeNewProduct implements Serializable {

    private static final long serialVersionUID = 204846674505413790L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("product_name")
    private String productName;

    @TableField("recommend_status")
    private Integer recommendStatus;

    @TableField("sort")
    private Integer sort;


}
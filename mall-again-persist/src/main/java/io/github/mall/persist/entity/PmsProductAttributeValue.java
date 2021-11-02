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
 * 存储产品参数信息的表(PmsProductAttributeValue)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_attribute_value")
public class PmsProductAttributeValue implements Serializable {

    private static final long serialVersionUID = -20772849600016033L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("product_attribute_id")
    private Long productAttributeId;

    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    @TableField("value")
    private String value;


}
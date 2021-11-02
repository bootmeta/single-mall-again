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
 * 商品会员价格表(PmsMemberPrice)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_member_price")
public class PmsMemberPrice implements Serializable {

    private static final long serialVersionUID = 161719793391680267L;

    @TableId
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("member_level_id")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @TableField("member_price")
    private Double memberPrice;

    @TableField("member_level_name")
    private String memberLevelName;


}
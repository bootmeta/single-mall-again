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
 * 优选专区和产品关系表(CmsPrefrenceAreaProductRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation implements Serializable {

    private static final long serialVersionUID = 550403114294733314L;

    @TableId
    private Long id;

    @TableField("prefrence_area_id")
    private Long prefrenceAreaId;

    @TableField("product_id")
    private Long productId;


}
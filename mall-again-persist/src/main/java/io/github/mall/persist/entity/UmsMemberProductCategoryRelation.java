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
 * 会员与产品分类关系表（用户喜欢的分类）(UmsMemberProductCategoryRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_product_category_relation")
public class UmsMemberProductCategoryRelation implements Serializable {

    private static final long serialVersionUID = -66761991230366052L;

    @TableId
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("product_category_id")
    private Long productCategoryId;


}
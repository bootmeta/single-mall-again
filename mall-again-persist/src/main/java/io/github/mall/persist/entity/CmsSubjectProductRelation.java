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
 * 专题商品关系表(CmsSubjectProductRelation)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_subject_product_relation")
public class CmsSubjectProductRelation implements Serializable {

    private static final long serialVersionUID = -25668807907655370L;

    @TableId
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    @TableField("product_id")
    private Long productId;


}
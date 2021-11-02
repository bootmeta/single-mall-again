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
 * 品牌表(PmsBrand)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_brand")
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = 890194200232732671L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 首字母
     */
    @TableField("first_letter")
    private String firstLetter;

    @TableField("sort")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField("factory_status")
    private Integer factoryStatus;

    @TableField("show_status")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField("product_count")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField("product_comment_count")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField("logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField("big_pic")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField("brand_story")
    private String brandStory;


}
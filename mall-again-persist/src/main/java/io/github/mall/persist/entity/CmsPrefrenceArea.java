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
 * 优选专区(CmsPrefrenceArea)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_prefrence_area")
public class CmsPrefrenceArea implements Serializable {

    private static final long serialVersionUID = -91598539835605650L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("sub_title")
    private String subTitle;

    /**
     * 展示图片
     */
    @TableField("pic")
    private Object pic;

    @TableField("sort")
    private Integer sort;

    @TableField("show_status")
    private Integer showStatus;


}
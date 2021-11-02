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
 * 相册表(PmsAlbum)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_album")
public class PmsAlbum implements Serializable {

    private static final long serialVersionUID = 469316871576900386L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("cover_pic")
    private String coverPic;

    @TableField("pic_count")
    private Integer picCount;

    @TableField("sort")
    private Integer sort;

    @TableField("description")
    private String description;


}
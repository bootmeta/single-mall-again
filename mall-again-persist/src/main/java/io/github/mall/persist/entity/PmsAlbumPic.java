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
 * 画册图片表(PmsAlbumPic)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_album_pic")
public class PmsAlbumPic implements Serializable {

    private static final long serialVersionUID = 483134962834429915L;

    @TableId
    private Long id;

    @TableField("album_id")
    private Long albumId;

    @TableField("pic")
    private String pic;


}
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
 * 首页推荐专题表(SmsHomeRecommendSubject)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_recommend_subject")
public class SmsHomeRecommendSubject implements Serializable {

    private static final long serialVersionUID = -61042732530294852L;

    @TableId
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    @TableField("subject_name")
    private String subjectName;

    @TableField("recommend_status")
    private Integer recommendStatus;

    @TableField("sort")
    private Integer sort;


}
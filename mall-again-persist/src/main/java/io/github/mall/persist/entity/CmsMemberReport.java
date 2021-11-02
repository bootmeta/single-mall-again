package io.github.mall.persist.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户举报表(CmsMemberReport)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cms_member_report")
public class CmsMemberReport implements Serializable {

    private static final long serialVersionUID = 511277244680395297L;

    @TableId
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @TableField("report_type")
    private Integer reportType;

    /**
     * 举报人
     */
    @TableField("report_member_name")
    private String reportMemberName;

    @TableField("create_time")
    private Date createTime;

    @TableField("report_object")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @TableField("report_status")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @TableField("handle_status")
    private Integer handleStatus;

    @TableField("note")
    private String note;


}
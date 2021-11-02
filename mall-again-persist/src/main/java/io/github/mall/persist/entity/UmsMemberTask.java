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
 * 会员任务表(UmsMemberTask)表实体类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_task")
public class UmsMemberTask implements Serializable {

    private static final long serialVersionUID = -76600715963513998L;

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 赠送成长值
     */
    @TableField("growth")
    private Integer growth;

    /**
     * 赠送积分
     */
    @TableField("intergration")
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    @TableField("type")
    private Integer type;


}
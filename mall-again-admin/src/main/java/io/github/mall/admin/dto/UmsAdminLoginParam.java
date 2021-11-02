package io.github.mall.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户登录参数
 * Created on 2018/4/26.
 */
@Data
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotNull(message = "用户名不能为空")
    private String loginName;
    @ApiModelProperty(value = "密码", required = true)
    @NotNull(message = "密码不能为空")
    private String password;
}

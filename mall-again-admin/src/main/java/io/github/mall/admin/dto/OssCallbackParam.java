package io.github.mall.admin.dto;

import lombok.Data;

/**
 * oss上传成功后的回调参数
 * Created on 2018/5/17.
 */
@Data
public class OssCallbackParam {

    private String callbackUrl;
    private String callbackBody;
    private String callbackBodyType;
}

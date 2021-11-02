package io.github.mall.admin.dto;

import lombok.Data;

@Data
public class OssPolicyParam {
    private String accessKeyId;
    private String policy;
    private String signature;
    private String dir;
    private String host;
    private String callback;
}

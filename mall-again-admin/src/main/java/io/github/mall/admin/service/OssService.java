package io.github.mall.admin.service;

import io.github.mall.admin.dto.OssPolicyParam;

/**
 * oss上传管理Service
 * Created on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyParam policy();
    /**
     * oss上传成功回调
     */
//    OssCallbackResult callback(HttpServletRequest request);
}

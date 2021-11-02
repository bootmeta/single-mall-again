package io.github.mall.admin.service;

import io.github.mall.admin.dto.UmsAdminParam;
import io.github.mall.common.api.Page;
import io.github.mall.persist.entity.UmsAdmin;

import java.util.List;

public interface UserService {

    /**
     * 用户信息注册
     *
     * @param umsAdminParam
     * @return
     */
    boolean register(UmsAdminParam umsAdminParam);

    /**
     * 用户登录
     *
     * @param loginName
     * @param password
     * @return
     */
    String login(String loginName, String password);

    /**
     * 刷新token
     *
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken, String tokenHead);

    Page<UmsAdmin> page(String loginName, Integer pageSize, Integer pageNum);
}

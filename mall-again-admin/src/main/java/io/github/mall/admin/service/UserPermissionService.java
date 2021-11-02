package io.github.mall.admin.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserPermissionService {

    @Transactional
    void updatePermission(Long adminId, List<Long> permissionIds);
}

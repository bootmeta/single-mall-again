package io.github.mall.admin.service;

import io.github.mall.persist.entity.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRoleService {

    @Transactional
    void updateUserRole(Long userId, List<Long> roleIds);

    List<UmsRole> getRoleList(Long adminId);
}

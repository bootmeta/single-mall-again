package io.github.mall.admin.service;

import io.github.mall.common.api.Page;
import io.github.mall.persist.entity.UmsRole;

public interface RoleService {


    Page<UmsRole> page(String keyword, Integer pageSize, Integer pageNum);
}

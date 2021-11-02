package io.github.mall.admin.service.impl;

import io.github.mall.admin.mapper.RoleMapper;
import io.github.mall.admin.service.RoleService;
import io.github.mall.common.api.Page;
import io.github.mall.persist.entity.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Page<UmsRole> page(String keyword, Integer pageSize, Integer pageNum) {
        Page<UmsRole> page = new Page<>();
        long count = roleMapper.count(keyword, pageSize, pageNum);
        List<UmsRole> datum = roleMapper.page(keyword, pageSize, pageNum);
        page.setTotal(count);
        page.setList(datum);
        return page;
    }
}

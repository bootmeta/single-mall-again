package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsRole;
import io.github.mall.persist.mapper.UmsRoleMapper;
import io.github.mall.persist.service.UmsRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户角色表(UmsRole)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole> implements UmsRoleService {

}
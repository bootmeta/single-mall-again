package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsPermission;
import io.github.mall.persist.mapper.UmsPermissionMapper;
import io.github.mall.persist.service.UmsPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户权限表(UmsPermission)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService {

}
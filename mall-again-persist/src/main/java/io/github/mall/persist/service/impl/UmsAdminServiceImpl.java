package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsAdmin;
import io.github.mall.persist.mapper.UmsAdminMapper;
import io.github.mall.persist.service.UmsAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户表(UmsAdmin)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

}
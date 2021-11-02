package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsAdminLoginLog;
import io.github.mall.persist.mapper.UmsAdminLoginLogMapper;
import io.github.mall.persist.service.UmsAdminLoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 后台用户登录日志表(UmsAdminLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsAdminLoginLogServiceImpl extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> implements UmsAdminLoginLogService {

}
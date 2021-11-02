package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberLoginLog;
import io.github.mall.persist.mapper.UmsMemberLoginLogMapper;
import io.github.mall.persist.service.UmsMemberLoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog> implements UmsMemberLoginLogService {

}
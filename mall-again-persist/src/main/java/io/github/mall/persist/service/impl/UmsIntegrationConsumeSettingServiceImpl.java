package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsIntegrationConsumeSetting;
import io.github.mall.persist.mapper.UmsIntegrationConsumeSettingMapper;
import io.github.mall.persist.service.UmsIntegrationConsumeSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 积分消费设置(UmsIntegrationConsumeSetting)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsIntegrationConsumeSettingServiceImpl extends ServiceImpl<UmsIntegrationConsumeSettingMapper, UmsIntegrationConsumeSetting> implements UmsIntegrationConsumeSettingService {

}
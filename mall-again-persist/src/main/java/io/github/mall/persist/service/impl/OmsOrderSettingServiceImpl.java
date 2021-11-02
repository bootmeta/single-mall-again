package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsOrderSetting;
import io.github.mall.persist.mapper.OmsOrderSettingMapper;
import io.github.mall.persist.service.OmsOrderSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单设置表(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> implements OmsOrderSettingService {

}
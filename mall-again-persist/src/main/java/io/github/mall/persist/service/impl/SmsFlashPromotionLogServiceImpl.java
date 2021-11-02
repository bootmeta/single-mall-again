package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsFlashPromotionLog;
import io.github.mall.persist.mapper.SmsFlashPromotionLogMapper;
import io.github.mall.persist.service.SmsFlashPromotionLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 限时购通知记录(SmsFlashPromotionLog)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsFlashPromotionLogServiceImpl extends ServiceImpl<SmsFlashPromotionLogMapper, SmsFlashPromotionLog> implements SmsFlashPromotionLogService {

}
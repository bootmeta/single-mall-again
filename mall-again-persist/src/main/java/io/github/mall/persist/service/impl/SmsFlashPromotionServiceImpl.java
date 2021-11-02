package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsFlashPromotion;
import io.github.mall.persist.mapper.SmsFlashPromotionMapper;
import io.github.mall.persist.service.SmsFlashPromotionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 限时购表(SmsFlashPromotion)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsFlashPromotionServiceImpl extends ServiceImpl<SmsFlashPromotionMapper, SmsFlashPromotion> implements SmsFlashPromotionService {

}
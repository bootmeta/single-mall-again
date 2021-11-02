package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsFlashPromotionProductRelation;
import io.github.mall.persist.mapper.SmsFlashPromotionProductRelationMapper;
import io.github.mall.persist.service.SmsFlashPromotionProductRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 商品限时购与商品关系表(SmsFlashPromotionProductRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsFlashPromotionProductRelationServiceImpl extends ServiceImpl<SmsFlashPromotionProductRelationMapper, SmsFlashPromotionProductRelation> implements SmsFlashPromotionProductRelationService {

}
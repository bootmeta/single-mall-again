package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsHomeRecommendProduct;
import io.github.mall.persist.mapper.SmsHomeRecommendProductMapper;
import io.github.mall.persist.service.SmsHomeRecommendProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 人气推荐商品表(SmsHomeRecommendProduct)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsHomeRecommendProductServiceImpl extends ServiceImpl<SmsHomeRecommendProductMapper, SmsHomeRecommendProduct> implements SmsHomeRecommendProductService {

}
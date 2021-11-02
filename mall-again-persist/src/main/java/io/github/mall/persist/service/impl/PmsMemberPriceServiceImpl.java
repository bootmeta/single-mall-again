package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsMemberPrice;
import io.github.mall.persist.mapper.PmsMemberPriceMapper;
import io.github.mall.persist.service.PmsMemberPriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格表(PmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsMemberPriceServiceImpl extends ServiceImpl<PmsMemberPriceMapper, PmsMemberPrice> implements PmsMemberPriceService {

}
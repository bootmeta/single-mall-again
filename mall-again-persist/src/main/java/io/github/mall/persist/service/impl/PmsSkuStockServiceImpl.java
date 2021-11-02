package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsSkuStock;
import io.github.mall.persist.mapper.PmsSkuStockMapper;
import io.github.mall.persist.service.PmsSkuStockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * sku的库存(PmsSkuStock)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements PmsSkuStockService {

}
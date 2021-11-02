package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProduct;
import io.github.mall.persist.mapper.PmsProductMapper;
import io.github.mall.persist.service.PmsProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 商品信息(PmsProduct)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService {

}
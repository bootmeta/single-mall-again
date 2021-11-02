package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductFullReduction;
import io.github.mall.persist.mapper.PmsProductFullReductionMapper;
import io.github.mall.persist.service.PmsProductFullReductionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 产品满减表(只针对同商品)(PmsProductFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements PmsProductFullReductionService {

}
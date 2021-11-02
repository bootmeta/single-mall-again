package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductLadder;
import io.github.mall.persist.mapper.PmsProductLadderMapper;
import io.github.mall.persist.service.PmsProductLadderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 产品阶梯价格表(只针对同商品)(PmsProductLadder)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductLadderServiceImpl extends ServiceImpl<PmsProductLadderMapper, PmsProductLadder> implements PmsProductLadderService {

}
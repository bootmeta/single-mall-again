package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsOrder;
import io.github.mall.persist.mapper.OmsOrderMapper;
import io.github.mall.persist.service.OmsOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单表(OmsOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService {

}
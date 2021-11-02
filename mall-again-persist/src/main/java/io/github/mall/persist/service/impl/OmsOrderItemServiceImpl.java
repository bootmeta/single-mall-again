package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsOrderItem;
import io.github.mall.persist.mapper.OmsOrderItemMapper;
import io.github.mall.persist.service.OmsOrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单中所包含的商品(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
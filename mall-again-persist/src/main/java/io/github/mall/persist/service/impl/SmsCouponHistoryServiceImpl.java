package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsCouponHistory;
import io.github.mall.persist.mapper.SmsCouponHistoryMapper;
import io.github.mall.persist.service.SmsCouponHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 优惠券使用、领取历史表(SmsCouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory> implements SmsCouponHistoryService {

}
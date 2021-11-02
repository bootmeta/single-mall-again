package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsCoupon;
import io.github.mall.persist.mapper.SmsCouponMapper;
import io.github.mall.persist.service.SmsCouponService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 优惠卷表(SmsCoupon)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponMapper, SmsCoupon> implements SmsCouponService {

}
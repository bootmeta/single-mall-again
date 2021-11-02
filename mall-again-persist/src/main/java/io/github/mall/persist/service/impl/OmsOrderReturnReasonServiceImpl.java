package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsOrderReturnReason;
import io.github.mall.persist.mapper.OmsOrderReturnReasonMapper;
import io.github.mall.persist.service.OmsOrderReturnReasonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 退货原因表(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

}
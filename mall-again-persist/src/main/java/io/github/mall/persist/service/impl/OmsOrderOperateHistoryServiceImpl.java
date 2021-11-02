package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsOrderOperateHistory;
import io.github.mall.persist.mapper.OmsOrderOperateHistoryMapper;
import io.github.mall.persist.service.OmsOrderOperateHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

}
package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsIntegrationChangeHistory;
import io.github.mall.persist.mapper.UmsIntegrationChangeHistoryMapper;
import io.github.mall.persist.service.UmsIntegrationChangeHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录表(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

}
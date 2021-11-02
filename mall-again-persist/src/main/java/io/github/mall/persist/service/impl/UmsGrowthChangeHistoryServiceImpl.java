package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsGrowthChangeHistory;
import io.github.mall.persist.mapper.UmsGrowthChangeHistoryMapper;
import io.github.mall.persist.service.UmsGrowthChangeHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录表(UmsGrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

}
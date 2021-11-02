package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberTask;
import io.github.mall.persist.mapper.UmsMemberTaskMapper;
import io.github.mall.persist.service.UmsMemberTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员任务表(UmsMemberTask)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberTaskServiceImpl extends ServiceImpl<UmsMemberTaskMapper, UmsMemberTask> implements UmsMemberTaskService {

}
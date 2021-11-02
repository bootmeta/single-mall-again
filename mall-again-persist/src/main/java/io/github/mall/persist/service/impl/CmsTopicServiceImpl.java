package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsTopic;
import io.github.mall.persist.mapper.CmsTopicMapper;
import io.github.mall.persist.service.CmsTopicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 话题表(CmsTopic)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsTopicServiceImpl extends ServiceImpl<CmsTopicMapper, CmsTopic> implements CmsTopicService {

}
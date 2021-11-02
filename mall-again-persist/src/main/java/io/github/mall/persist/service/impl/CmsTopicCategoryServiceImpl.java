package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsTopicCategory;
import io.github.mall.persist.mapper.CmsTopicCategoryMapper;
import io.github.mall.persist.service.CmsTopicCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 话题分类表(CmsTopicCategory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsTopicCategoryServiceImpl extends ServiceImpl<CmsTopicCategoryMapper, CmsTopicCategory> implements CmsTopicCategoryService {

}
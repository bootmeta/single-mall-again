package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsSubject;
import io.github.mall.persist.mapper.CmsSubjectMapper;
import io.github.mall.persist.service.CmsSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 专题表(CmsSubject)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsSubjectServiceImpl extends ServiceImpl<CmsSubjectMapper, CmsSubject> implements CmsSubjectService {

}
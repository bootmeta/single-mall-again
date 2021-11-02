package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsHomeRecommendSubject;
import io.github.mall.persist.mapper.SmsHomeRecommendSubjectMapper;
import io.github.mall.persist.service.SmsHomeRecommendSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 首页推荐专题表(SmsHomeRecommendSubject)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsHomeRecommendSubjectServiceImpl extends ServiceImpl<SmsHomeRecommendSubjectMapper, SmsHomeRecommendSubject> implements SmsHomeRecommendSubjectService {

}
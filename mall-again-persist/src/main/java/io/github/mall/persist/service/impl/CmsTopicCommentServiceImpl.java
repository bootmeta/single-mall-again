package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsTopicComment;
import io.github.mall.persist.mapper.CmsTopicCommentMapper;
import io.github.mall.persist.service.CmsTopicCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 专题评论表(CmsTopicComment)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsTopicCommentServiceImpl extends ServiceImpl<CmsTopicCommentMapper, CmsTopicComment> implements CmsTopicCommentService {

}
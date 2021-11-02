package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsComment;
import io.github.mall.persist.mapper.PmsCommentMapper;
import io.github.mall.persist.service.PmsCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 商品评价表(PmsComment)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentMapper, PmsComment> implements PmsCommentService {

}
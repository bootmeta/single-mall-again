package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberTag;
import io.github.mall.persist.mapper.UmsMemberTagMapper;
import io.github.mall.persist.service.UmsMemberTagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户标签表(UmsMemberTag)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberTagServiceImpl extends ServiceImpl<UmsMemberTagMapper, UmsMemberTag> implements UmsMemberTagService {

}
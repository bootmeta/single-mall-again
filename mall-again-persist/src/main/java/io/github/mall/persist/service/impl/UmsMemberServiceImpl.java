package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMember;
import io.github.mall.persist.mapper.UmsMemberMapper;
import io.github.mall.persist.service.UmsMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员表(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

}
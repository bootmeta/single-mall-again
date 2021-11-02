package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsHelp;
import io.github.mall.persist.mapper.CmsHelpMapper;
import io.github.mall.persist.service.CmsHelpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 帮助表(CmsHelp)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsHelpServiceImpl extends ServiceImpl<CmsHelpMapper, CmsHelp> implements CmsHelpService {

}
package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberRuleSetting;
import io.github.mall.persist.mapper.UmsMemberRuleSettingMapper;
import io.github.mall.persist.service.UmsMemberRuleSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员积分成长规则表(UmsMemberRuleSetting)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberRuleSettingServiceImpl extends ServiceImpl<UmsMemberRuleSettingMapper, UmsMemberRuleSetting> implements UmsMemberRuleSettingService {

}
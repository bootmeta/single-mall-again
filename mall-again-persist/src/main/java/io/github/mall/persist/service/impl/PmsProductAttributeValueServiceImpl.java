package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductAttributeValue;
import io.github.mall.persist.mapper.PmsProductAttributeValueMapper;
import io.github.mall.persist.service.PmsProductAttributeValueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductAttributeValueServiceImpl extends ServiceImpl<PmsProductAttributeValueMapper, PmsProductAttributeValue> implements PmsProductAttributeValueService {

}
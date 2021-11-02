package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductAttribute;
import io.github.mall.persist.mapper.PmsProductAttributeMapper;
import io.github.mall.persist.service.PmsProductAttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 商品属性参数表(PmsProductAttribute)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductAttributeServiceImpl extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements PmsProductAttributeService {

}
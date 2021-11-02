package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.SmsCouponProductCategoryRelation;
import io.github.mall.persist.mapper.SmsCouponProductCategoryRelationMapper;
import io.github.mall.persist.service.SmsCouponProductCategoryRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 优惠券和产品分类关系表(SmsCouponProductCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class SmsCouponProductCategoryRelationServiceImpl extends ServiceImpl<SmsCouponProductCategoryRelationMapper, SmsCouponProductCategoryRelation> implements SmsCouponProductCategoryRelationService {

}
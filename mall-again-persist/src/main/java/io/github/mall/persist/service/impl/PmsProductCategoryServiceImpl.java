package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsProductCategory;
import io.github.mall.persist.mapper.PmsProductCategoryMapper;
import io.github.mall.persist.service.PmsProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 产品分类(PmsProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements PmsProductCategoryService {

}
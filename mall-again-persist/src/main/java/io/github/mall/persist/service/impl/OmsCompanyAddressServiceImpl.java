package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.OmsCompanyAddress;
import io.github.mall.persist.mapper.OmsCompanyAddressMapper;
import io.github.mall.persist.service.OmsCompanyAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 公司收发货地址表(OmsCompanyAddress)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class OmsCompanyAddressServiceImpl extends ServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress> implements OmsCompanyAddressService {

}
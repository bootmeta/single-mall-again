package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.UmsMemberReceiveAddress;
import io.github.mall.persist.mapper.UmsMemberReceiveAddressMapper;
import io.github.mall.persist.service.UmsMemberReceiveAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址表(UmsMemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

}
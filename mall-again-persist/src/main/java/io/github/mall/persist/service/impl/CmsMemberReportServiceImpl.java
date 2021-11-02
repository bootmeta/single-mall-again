package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.CmsMemberReport;
import io.github.mall.persist.mapper.CmsMemberReportMapper;
import io.github.mall.persist.service.CmsMemberReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户举报表(CmsMemberReport)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:09
 */
@Slf4j
@Service
public class CmsMemberReportServiceImpl extends ServiceImpl<CmsMemberReportMapper, CmsMemberReport> implements CmsMemberReportService {

}
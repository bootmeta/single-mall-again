package io.github.mall.persist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.mall.persist.entity.PmsAlbum;
import io.github.mall.persist.mapper.PmsAlbumMapper;
import io.github.mall.persist.service.PmsAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 相册表(PmsAlbum)表服务实现类
 *
 * @author makejava
 * @since 2021-10-28 17:42:10
 */
@Slf4j
@Service
public class PmsAlbumServiceImpl extends ServiceImpl<PmsAlbumMapper, PmsAlbum> implements PmsAlbumService {

}
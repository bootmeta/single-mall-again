package io.github.mall.common.api;

import lombok.Data;

import java.util.List;

@Data
public class Page<E> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<E> list;
}

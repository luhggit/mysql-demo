package com.example.simplemysqldemo.vo;

import lombok.Data;

import java.util.List;

/**
 * 分页查询
 * @author lhg
 * @date 2019-07-25 10:30
 */
@Data
public class PageQueryVO<T> {

    private Integer totalCount;

    private List<T> list;

}

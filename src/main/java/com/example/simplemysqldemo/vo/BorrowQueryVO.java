package com.example.simplemysqldemo.vo;

import lombok.Data;

/**
 * @author lhg
 * @date 2019-07-24 13:57
 */
@Data
public class BorrowQueryVO {

    private Integer studentId;

    private Integer bookId;

    private Integer page;

    private Integer size;

    private Integer offset;
}

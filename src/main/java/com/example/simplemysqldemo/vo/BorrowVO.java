package com.example.simplemysqldemo.vo;

import lombok.Data;

/**
 * @author lhg
 * @date 2019-07-24 13:56
 */
@Data
public class BorrowVO {

    private Integer id;

    private Integer studentId;

    private String studentName;

    private Integer bookId;

    private String bookName;
}

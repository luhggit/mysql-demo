package com.example.simplemysqldemo.po;

import lombok.Data;

@Data
public class BorrowRecord {
    private Integer id;

    private Integer bookId;

    private Integer studentId;
}
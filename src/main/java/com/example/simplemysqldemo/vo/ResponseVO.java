package com.example.simplemysqldemo.vo;

import lombok.Data;

/**
 * @author lhg
 * @date 2019-07-24 15:58
 */
@Data
public class ResponseVO<T> {

    private Integer status;

    private String info;

    private T data;

    public void setData(T data) {
        this.data = data;
    }
}

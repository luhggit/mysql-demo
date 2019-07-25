package com.example.simplemysqldemo.util;

import com.example.simplemysqldemo.vo.ResponseVO;

/**
 * @author lhg
 * @date 2018-09-03 14:58
 * @description response处理工具
 */
public class ResultUtils {

    /**
     * 返回处理成功的ResponseVO
     * @param data 返回的数据
     * @return
     */
    public static <T> ResponseVO<T> success(T data){
        ResponseVO<T> response = new ResponseVO<>();
        response.setStatus(200);
        response.setInfo("成功");
        response.setData(data);
        return response;
    }

    /**
     * 返回处理成功的ResponseVO
     * @return
     */
    public static <T> ResponseVO<T> success(){
        return success(null);
    }
}

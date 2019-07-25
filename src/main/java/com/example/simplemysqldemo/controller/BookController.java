package com.example.simplemysqldemo.controller;

import com.example.simplemysqldemo.dao.BookMapper;
import com.example.simplemysqldemo.po.Book;
import com.example.simplemysqldemo.util.ResultUtils;
import com.example.simplemysqldemo.vo.BookVO;
import com.example.simplemysqldemo.vo.ResponseVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lhg
 * @date 2019-07-25 13:43
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookMapper bookMapper;

    /**
     * 添加书本
     * @param bookVO
     * @return
     */
    @PostMapping
    public ResponseVO<Void> add(@RequestBody BookVO bookVO) {
        Book book = new Book();
        book.setName(bookVO.getName());
        bookMapper.insertSelective(book);

        return ResultUtils.success();
    }
}

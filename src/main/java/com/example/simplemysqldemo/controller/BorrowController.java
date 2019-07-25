package com.example.simplemysqldemo.controller;

import com.example.simplemysqldemo.dao.BorrowRecordMapper;
import com.example.simplemysqldemo.po.BorrowRecord;
import com.example.simplemysqldemo.util.ResultUtils;
import com.example.simplemysqldemo.vo.BorrowQueryVO;
import com.example.simplemysqldemo.vo.BorrowRecordVO;
import com.example.simplemysqldemo.vo.BorrowVO;
import com.example.simplemysqldemo.vo.PageQueryVO;
import com.example.simplemysqldemo.vo.ResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhg
 * @date 2019-07-24 13:55
 */
@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Resource
    private BorrowRecordMapper borrowRecordMapper;

    /**
     * 分页获取图书借阅记录
     * @param borrowQueryVO
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public ResponseVO<PageQueryVO<BorrowVO>> list(BorrowQueryVO borrowQueryVO) {
        borrowQueryVO.setOffset((borrowQueryVO.getPage() - 1) * borrowQueryVO.getSize());

        int count = borrowRecordMapper.countByQueryVO(borrowQueryVO);
        List<BorrowVO> borrows = borrowRecordMapper.listByQueryVO(borrowQueryVO);

        PageQueryVO<BorrowVO> pageQueryVO = new PageQueryVO<>();
        pageQueryVO.setList(borrows);
        pageQueryVO.setTotalCount(count);

        return ResultUtils.success(pageQueryVO);
    }

    /**
     * 添加借阅记录
     * @param borrowRecordVO
     * @return
     */
    @PostMapping
    public ResponseVO<Void> add(@RequestBody BorrowRecordVO borrowRecordVO) {
        BorrowRecord borrowRecord = new BorrowRecord();
        borrowRecord.setBookId(borrowRecordVO.getBookId());
        borrowRecord.setStudentId(borrowRecordVO.getStudentId());
        borrowRecordMapper.insertSelective(borrowRecord);

        return ResultUtils.success();
    }
}

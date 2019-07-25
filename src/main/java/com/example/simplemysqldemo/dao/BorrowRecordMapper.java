package com.example.simplemysqldemo.dao;

import com.example.simplemysqldemo.po.BorrowRecord;
import com.example.simplemysqldemo.vo.BorrowQueryVO;
import com.example.simplemysqldemo.vo.BorrowVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowRecord record);

    int insertSelective(BorrowRecord record);

    BorrowRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BorrowRecord record);

    int updateByPrimaryKey(BorrowRecord record);

    /**
     * 根据borrowQueryVO查找
     * @param borrowQueryVO
     * @return
     */
    List<BorrowVO> listByQueryVO(@Param("queryVO") BorrowQueryVO borrowQueryVO);

    /**
     * 根据borrowQueryVO统计
     * @param borrowQueryVO
     * @return
     */
    int countByQueryVO(@Param("queryVO") BorrowQueryVO borrowQueryVO);
}
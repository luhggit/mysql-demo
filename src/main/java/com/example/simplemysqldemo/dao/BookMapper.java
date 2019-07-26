package com.example.simplemysqldemo.dao;

import com.example.simplemysqldemo.po.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    /**
     * 获取所有的书本
     * @return
     */
    @Select("select id, name from book order by id desc")
    List<Book> listAll();
}
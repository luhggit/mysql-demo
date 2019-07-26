package com.example.simplemysqldemo.dao;

import com.example.simplemysqldemo.po.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 获取所有的学生
     * @return
     */
    @Select("select id,name from student order by id desc")
    List<Student> listAll();
}
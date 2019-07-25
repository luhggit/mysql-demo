package com.example.simplemysqldemo.controller;

import com.example.simplemysqldemo.dao.StudentMapper;
import com.example.simplemysqldemo.po.Student;
import com.example.simplemysqldemo.util.ResultUtils;
import com.example.simplemysqldemo.vo.ResponseVO;
import com.example.simplemysqldemo.vo.StudentVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lhg
 * @date 2019-07-25 13:41
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 新增学生
     * @param studentVO
     * @return
     */
    @PostMapping
    public ResponseVO<Void> add(@RequestBody StudentVO studentVO) {
        Student student = new Student();
        student.setName(studentVO.getName());
        studentMapper.insertSelective(student);

        return ResultUtils.success();
    }
}

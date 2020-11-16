package com.garfield.db.shardingjdbc.controller;

import com.garfield.db.shardingjdbc.bean.StudentBean;
import com.garfield.db.shardingjdbc.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@RestController
@RequestMapping(value = "/garfield")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/addStudent")
    public void addStudent(@ModelAttribute StudentBean student){
        studentMapper.insertStudent(student);
    }

    @GetMapping("/getStudentById")
    public StudentBean getStudentById(Integer id){
        return studentMapper.selectById(id);
    }
}

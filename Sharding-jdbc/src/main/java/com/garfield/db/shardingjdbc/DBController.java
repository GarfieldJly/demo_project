package com.garfield.db.shardingjdbc;

import com.garfield.db.shardingjdbc.dao.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shardingjdbc")
public class DBController {
    private final StudentMapper studentMapper;

    public DBController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("/addStudent")
    public void addStudent() {
        Student student = new Student();
        student.setName("cat");
        student.setSex("female");
        studentMapper.insert(student);
    }

    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam Integer id) {
        Student student = studentMapper.select(id);
        return student;
    }
}

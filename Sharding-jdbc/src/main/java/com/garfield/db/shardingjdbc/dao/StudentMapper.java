package com.garfield.db.shardingjdbc.dao;

import com.garfield.db.shardingjdbc.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper  {
    void insert(@Param("student") Student student);

    Student select(@Param("id") Integer id);

}
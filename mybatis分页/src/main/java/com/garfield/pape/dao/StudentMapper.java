package com.garfield.pape.dao;

import com.garfield.pape.bean.StudentBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@Repository
public interface StudentMapper {
    void insertStudent(@Param("studentBean") StudentBean studentBean);

    StudentBean selectById(@Param("id") Integer id);

    List<StudentBean> selectAll();

    void updateStudentById(@Param("req") StudentBean req);

}

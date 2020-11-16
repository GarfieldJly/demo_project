package com.garfield.db.shardingjdbc.dao;

import com.garfield.db.shardingjdbc.bean.StudentBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@Repository
public interface StudentMapper {
    void insertStudent(@Param("studentBean") StudentBean studentBean);

    StudentBean selectById(@Param("id") Integer id);
}

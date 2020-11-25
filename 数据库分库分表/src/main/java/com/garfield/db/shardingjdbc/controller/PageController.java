package com.garfield.db.shardingjdbc.controller;

import com.garfield.db.shardingjdbc.dao.StudentMapper;
import com.garfield.db.shardingjdbc.domain.req.PageReq;
import com.garfield.db.shardingjdbc.domain.res.StudentRes;
import com.garfield.db.shardingjdbc.util.PageUtils;
import com.garfield.db.shardingjdbc.vo.StudentBean;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jingliyuan
 * @date 2020/11/23
 */
@RestController
@RequestMapping("/page")
public class PageController {
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/getStudentList")
    public PageInfo<StudentRes> getStudentList(PageReq pageReq){
        List<StudentBean> studentBeanList = studentMapper.selectAll();
        PageInfo<StudentBean> studentBeanPageInfo = new PageInfo<StudentBean>(studentBeanList);
        PageInfo<StudentRes> vPageInfo = PageUtils.PageInfo2PageInfoVo(studentBeanPageInfo);
        for(StudentBean studentBean : studentBeanList){
            StudentRes target = new StudentRes();
            BeanUtils.copyProperties(studentBean,target);
            vPageInfo.getList().add(target);
        }
        return vPageInfo;
    }
}

package com.garfield.pape.control;

import com.garfield.pape.bean.StudentBean;
import com.garfield.pape.dao.StudentMapper;
import com.garfield.pape.req.PageReq;
import com.garfield.pape.res.StudentRes;
import com.garfield.pape.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        PageHelper.startPage(pageReq.getPageNumber(),pageReq.getPageSize());
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

    @PostMapping("/addStudent")
    public String addStudent(StudentBean studentBean){
        studentMapper.insertStudent(studentBean);
        return "Success";
    }
}

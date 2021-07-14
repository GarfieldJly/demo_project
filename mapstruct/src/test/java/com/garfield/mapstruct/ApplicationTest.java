package com.garfield.mapstruct;

import com.garfield.mapstruct.convert.StudentConvert;
import com.garfield.mapstruct.domain.StudentDO;
import com.garfield.mapstruct.domain.StudentRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author zhaojian
 * @date 2021/7/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    private final static Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    @Resource
    private StudentConvert studentConvert;
    /**
     * 测试MapStruct
     */
    @Test
    public void testMapStruct() {
        //用参数值创建对象
        StudentDO studentDO = studentConvert.buildStudentDO("garfield", 18, "高三");
        logger.info("[StudentConvert.buildStudentDO], studentDO :{}",studentDO);

        StudentRequest studentRequest = studentConvert.doToRequest(studentDO);
        logger.info("[StudentConvert.doToRequest], studentRequest :{}",studentRequest);
    };

}
package com.garfield.mapstruct.convert;

import com.garfield.mapstruct.constant.SexEnum;
import com.garfield.mapstruct.domain.StudentDO;
import com.garfield.mapstruct.domain.StudentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author zhaojian
 * @date 2021/7/14
 */
@Mapper(componentModel = "spring",imports = {SexEnum.class})
public interface StudentConvert {
    @Mapping(source = "name", target = "nameStr")
    @Mapping(source = "grade", target = "gradeStr")
    StudentRequest doToRequest(StudentDO studentDO);

    StudentDO buildStudentDO(String name, int age, String grade);
}

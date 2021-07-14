package com.garfield.mapstruct.domain;

/**
 * @author zhaojian
 * @date 2021/7/14
 */
public class StudentRequest {
    private String nameStr;

    private Integer age;

    private String gradeStr;

    /**
     * 性别，用enum表示
     */
    private Integer sex;

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGradeStr() {
        return gradeStr;
    }

    public void setGradeStr(String gradeStr) {
        this.gradeStr = gradeStr;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public StudentRequest(String nameStr, Integer age, String gradeStr, Integer sex) {
        this.nameStr = nameStr;
        this.age = age;
        this.gradeStr = gradeStr;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentRequest{" +
                "nameStr='" + nameStr + '\'' +
                ", age=" + age +
                ", gradeStr='" + gradeStr + '\'' +
                ", sex=" + sex +
                '}';
    }
}

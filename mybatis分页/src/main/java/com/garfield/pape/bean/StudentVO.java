package com.garfield.pape.bean;

import java.util.List;

/**
 * @author jingliyuan
 * @date 2021/2/4
 */
public class StudentVO {
    private String name;
    private List<PeopleVO> peopleVOList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PeopleVO> getPeopleVOList() {
        return peopleVOList;
    }

    public void setPeopleVOList(List<PeopleVO> peopleVOList) {
        this.peopleVOList = peopleVOList;
    }
}

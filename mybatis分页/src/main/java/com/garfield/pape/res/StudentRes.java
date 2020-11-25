package com.garfield.pape.res;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
public class StudentRes implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

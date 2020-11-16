package com.garfield.db.shardingjdbc.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@Table(name = "student")
@Data
public class StudentBean implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;
}

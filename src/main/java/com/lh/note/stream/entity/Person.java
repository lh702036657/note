package com.lh.note.stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    /**
     * 名称
     */
    private String name;

    /**
     * 薪资
     */
    private int salary;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地区
     */
    private String area;
}

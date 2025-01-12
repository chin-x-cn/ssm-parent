package com.atguigu.spring.ioc.bean;

import lombok.Data;

/**
 * @Program: ssm-parent
 * @Description:
 * @Author: Chen
 * @Create: 2025-01-12 10:09
 **/
@Data
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person的无参构造方法执行了...");
    }
}

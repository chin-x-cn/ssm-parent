package com.atguigu.spring.ioc.config;

import com.atguigu.spring.ioc.bean.Person;
import com.atguigu.spring.ioc.condition.MacCondition;
import com.atguigu.spring.ioc.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @Program: ssm-parent
 * @Description:
 * @Author: Chen
 * @Create: 2025-01-12 21:06
 **/

@Configuration
public class PersonConfig {

    //场景：判断当前电脑的操作系统是windows还是mac
    //  windows 系统，容器中有 bill
    //  mac 系统，容器中有 jobs
    @Conditional(MacCondition.class)
    @Bean("jobs")
    public Person jobs(){
        Person person = new Person();
        person.setName("乔布斯");
        person.setAge(20);
        person.setGender("男");
        return person;
    }

    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person bill(){
        Person person = new Person();
        person.setName("比尔盖茨");
        person.setAge(20);
        person.setGender("男");
        return person;
    }


    // 3.给容器中注册一个组件，容器中的每个组件都有一个唯一的名字，方法名就是唯一的名字
    @Lazy
    @Bean("zhangsan")
    public Person zhangsan(){
        // GenerateAllSetter插件，生成setter方法
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        person.setGender("男");
        return person;
    }


    @Bean("lisi")
    public Person lisi(){
        // GenerateAllSetter插件，生成setter方法
        Person person = new Person();
        person.setName("李四");
        person.setAge(22);
        person.setGender("男");
        return person;
    }
}

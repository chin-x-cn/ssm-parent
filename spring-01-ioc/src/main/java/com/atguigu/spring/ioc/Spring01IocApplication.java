package com.atguigu.spring.ioc;

import com.atguigu.spring.ioc.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {
        // 1.启动Spring应用程序，ApplicationContext：Spring应用上下文环境； IOC容器
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("ioc = " + ioc);

        System.out.println("------------------------");

        // 2.获取到容器中所有组件的名字，容器中装了哪些组件，Spring启动会有默认的组件，比如：标注了@Controller、@Service、@Configuration等
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }

        // 4.获取容器中某个组件
        // 组件的四大特性：名字、类型、对象、作用域
    }

    // 3.给容器中注册一个组件，容器中的每个组件都有一个唯一的名字，方法名就是唯一的名字
    @Bean("hahaha")
    public Person zhangsan(){
        // GenerateAllSetter插件，生成setter方法
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        person.setGender("男");
        return person;
    }
}

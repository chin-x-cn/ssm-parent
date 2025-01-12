package com.atguigu.spring.ioc.config;

import ch.qos.logback.core.CoreConstants;
import com.atguigu.spring.ioc.bean.Dog;
import com.atguigu.spring.ioc.bean.Person;
import com.atguigu.spring.ioc.service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Program: ssm-parent
 * @Description:
 * @Author: Chen
 * @Create: 2025-01-12 21:07
 **/

/**
 * 第三方组件想要导入容器中：没办法快速标注分层注解
 * 1、@Bean：自己new，注册给容器
 * 2、@Component 等分层注解
 * 3、@Import：快速导入组件
 */
@Configuration
public class DogConfig {

//    @ConditionalOnMissingBean(value = {UserService.class})
//    @ConditionalOnMissingBean(name="jobs",value = {Person.class})
//    @ConditionalOnMissingBean(name = "bill") // Spring在底层会有多组件名字判定bug。
//    @ConditionalOnResource(resources="classpath:haha.abc")

    @Lazy // 单例模式，可以继续调整为懒加载
    @Bean
    public Dog dog(){
        return new Dog();
    }


}

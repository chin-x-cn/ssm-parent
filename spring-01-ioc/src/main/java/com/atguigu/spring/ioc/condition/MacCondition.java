package com.atguigu.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Program: ssm-parent
 * @Description:
 * @Author: Chen
 * @Create: 2025-01-13 21:22
 **/
public class MacCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 判断环境变量中的OS包含Windows，就是Windows系统
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("OS");
        if (property != null) {
            return property.contains("Mac");
        }
        return false;
    }
}

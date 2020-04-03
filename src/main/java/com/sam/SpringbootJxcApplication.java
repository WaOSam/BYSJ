package com.sam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 *@Author: Same_T
 *@date: 2020-03-26 16:59:41
 *@Description: springboot的入口启动类
 */
@SpringBootApplication
@MapperScan("com.sam.mapper")
@ImportResource("classpath:transaction.xml")
public class SpringbootJxcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJxcApplication.class, args);
    }

}

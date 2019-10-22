package com.spring.specurity;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liudongting
 * @date 2019/8/19 14:26
 */
@ComponentScan(basePackages = "com.spring")
@SpringBootApplication
public class StudyApplication extends SpringBootServletInitializer {

    public static void main(String [] args){
        SpringApplication.run(StudyApplication.class, args);
    }

}

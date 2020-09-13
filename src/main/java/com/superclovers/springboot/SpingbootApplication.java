package com.superclovers.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.superclovers.springboot.mapper")
public class SpingbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootApplication.class, args);
    }

}

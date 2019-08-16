package com.poldichen.markerspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.poldichen.markerspringboot.dao")
public class MarkerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkerSpringbootApplication.class, args);
    }

}

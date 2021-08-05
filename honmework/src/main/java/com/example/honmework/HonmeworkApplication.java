package com.example.honmework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.honmework.dao")
public class HonmeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HonmeworkApplication.class, args);
    }

}

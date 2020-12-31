package com.glaway.excel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.glaway.excel.dao")
public class ExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelApplication.class, args);
    }

}

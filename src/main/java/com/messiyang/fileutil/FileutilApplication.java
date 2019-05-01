package com.messiyang.fileutil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.messiyang.fileutil.dao")
@SpringBootApplication
public class FileutilApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileutilApplication.class, args);
    }

}

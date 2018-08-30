package com.jys.jyplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jys.jyplus.heytea.dao", "com.jys.jyplus.trouble.dao"})

public class JyplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyplusApplication.class, args);
    }
}

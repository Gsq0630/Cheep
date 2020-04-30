package org.lanqiao.myjd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
@MapperScan("org.lanqiao.myjd.mapper")

public class MyjdApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyjdApplication.class, args);
    }

}

package com.jgace.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SpringBootApplication
//添加MybatisPlus注解
@EnableAsync
public class MainApplication {
    private final static Logger logger = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        long before = new Date().getTime();
        SpringApplication.run(MainApplication.class, args);
        long after = new Date().getTime();
        logger.info(MainApplication.class.getSimpleName() + " is success!");
        logger.info("Recorded a time of : "+ BigDecimal.valueOf((after -before)).divide(BigDecimal.valueOf(1000),2, RoundingMode.HALF_UP) +"s");
    }


}

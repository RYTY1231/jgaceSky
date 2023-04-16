package com.jgaceSky.database.config;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.jgaceSky.**.mapper"})
@Logger
public class MybatisPlusConfig {

    @Bean
    public void init() {
        System.out.println("MybatisPlusConfig init");
    }
}

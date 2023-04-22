package com.jgace.main.config;

import lombok.extern.slf4j.Slf4j;
//import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan(basePackages = {"com.jgaceSky.**.mapper"})
@Slf4j
public class MybatisPlusConfig {
    Logger logger = org.slf4j.LoggerFactory.getLogger(MybatisPlusConfig.class);

    @Bean
    public void init() {
        logger.info("MybatisPlusConfig init");
    }
}

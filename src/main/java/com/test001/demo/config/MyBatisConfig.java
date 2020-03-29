package com.test001.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.test001.demo.mbg.mapper")
public class MyBatisConfig {
}

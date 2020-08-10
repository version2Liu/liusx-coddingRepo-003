package com.liusx.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * description: MybatisPlusConfig <br>
 * date: 2020/8/10 9:42 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.liusx.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}

package com.mp.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {
    @Bean
    PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

package com.shubham.config;

import com.shubham.aspect.LoggingAspect;
import com.shubham.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public BookService bookService() {

        return new BookService();

    }

    @Bean
    public LoggingAspect loggingAspect() {

        return new LoggingAspect();

    }

}
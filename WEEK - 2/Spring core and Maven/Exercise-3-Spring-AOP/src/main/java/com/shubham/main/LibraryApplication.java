package com.shubham.main;

import com.shubham.config.SpringConfig;
import com.shubham.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService service = context.getBean(BookService.class);

        service.issueBook();

    }

}
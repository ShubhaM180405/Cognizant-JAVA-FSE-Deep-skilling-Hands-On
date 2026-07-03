package com.shubham.main;

import com.shubham.repository.BookRepository;
import com.shubham.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        service.displayService();

        repository.displayRepository();

        System.out.println("Spring configuration loaded successfully.");

    }

}
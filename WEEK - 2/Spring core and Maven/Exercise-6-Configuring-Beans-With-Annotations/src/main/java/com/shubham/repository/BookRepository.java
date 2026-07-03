package com.shubham.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String fetchRepositoryStatus() {

        return "Book Repository detected through @Repository annotation!!..";

    }

}
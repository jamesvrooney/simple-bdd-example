package com.rooney.james.service;

import com.rooney.james.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> getAllBooks() {
        log.info("Getting all books");

        Book book1 = Book.builder()
                .name("A Tale of Two Cities")
                .author("Charles Dickens")
                .yearPublished(1867)
                .build();

        Book book2 = Book.builder()
                .name("Godzilla")
                .author("John Smith")
                .yearPublished(1946)
                .build();

        Book book3 = Book.builder()
                .name("War and Peace")
                .author("Some Dude")
                .yearPublished(1918)
                .build();

        List<Book> books = Arrays.asList(book1, book2, book3);

        return books;
    }
}

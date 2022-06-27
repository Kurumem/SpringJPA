package org.example.controller;

import org.example.model.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private List getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    private Book getBook(@PathVariable("id") long id){
        return bookService.getBookId(id);
    }

    @GetMapping("/books/title/{title}")
    private List getBookTitle(@PathVariable("title") String title){
         return bookService.getBookTitle(title);
    }





}

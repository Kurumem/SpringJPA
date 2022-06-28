package org.example.controller;

import org.example.model.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    //Вызов всех добавленных книг
    @GetMapping("/books")
    private List getAllBooks(){
        List books = bookService.getAllBooks();

        return bookService.getAllBooks();

    }
    //Поиск книги по ид
    @GetMapping("/books/find")
    private Book getBook(@RequestParam(value = "id") long id){
        return bookService.getBookId(id);
    }


    //Поиск книги по названию
    @GetMapping("/books/find")
    private List getBookTitle(@RequestParam(value = "title") String title){
         return bookService.getBookTitle(title);
    }

    //Добавить книгу в БД
    @GetMapping("/books/add")
    private List saveList(@RequestParam(value = "title") String title, @RequestParam(value = "genre") String genre) {

        bookService.getBookList(title,genre);
        return bookService.getAllBooks();
    }
    //Удалить книгу по ид
    @GetMapping("/books/delete")
    private void deleteBook(@RequestParam(value = "id") long id){

         bookService.deleteBook(id);
    }


}

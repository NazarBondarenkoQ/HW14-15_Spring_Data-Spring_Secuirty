package edu.cursor.springsecurity.controller;

import edu.cursor.springsecurity.models.Book;
import edu.cursor.springsecurity.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService BookService;

    @Secured("ADMIN")
    @PostMapping("/admin/add/book")
    public void saveBook(@RequestBody Book book) {
        BookService.saveBook(book);
    }

    @Secured({"USER", "ADMIN"})
    @GetMapping("/user/find/book/{id}")
    public Book findBook(@PathVariable("id") Integer authorID) {
        return BookService.findBook(authorID);
    }

    @Secured("ADMIN")
    @DeleteMapping("/admin/delete/book/{id}")
    public void deleteBook(@PathVariable("id") Integer authorID) {
        BookService.deleteBook(authorID);
    }

}
package edu.cursor.springsecurity.controller;

import edu.cursor.springsecurity.models.Author;
import edu.cursor.springsecurity.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AuthorController {

    private AuthorService AuthorService;

    @Secured("ADMIN")
    @PostMapping("add/author")
    public void saveAuthor(@RequestBody Author author) {
        AuthorService.saveAuthor(author);
    }

    @Secured({"USER", "ADMIN"})
    @GetMapping("find/author/{id}")
    public Author findAuthor(@PathVariable("id") Integer authorID) {
        return AuthorService.findAuthor(authorID);
    }
    @Secured("ADMIN")
    @DeleteMapping("delete/author/{id}")
    public void deleteAuthor(@PathVariable("id") Integer authorID) {
        AuthorService.deleteAuthor(authorID);
    }

}
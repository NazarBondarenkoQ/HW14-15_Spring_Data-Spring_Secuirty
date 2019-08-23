package edu.cursor.springsecurity.controller;

import edu.cursor.springsecurity.models.Author;
import edu.cursor.springsecurity.service.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class AuthorController {

    private IAuthorService IAuthorService;

    @PostMapping("/admin/add_author")
    public void saveAuthor(@RequestBody Author author) {
        IAuthorService.saveAuthor(author);
    }

    @GetMapping("/user/find_author/{authorID}")
    public Optional<Author> findAuthor(@PathVariable("authorID") Integer authorID) {
        return IAuthorService.findAuthor(authorID);
    }

    @DeleteMapping("/admin/delete_author/{authorID}")
    public void deleteAuthor(@PathVariable("authorID") Integer authorID) {
        IAuthorService.deleteAuthor(authorID);
    }

}

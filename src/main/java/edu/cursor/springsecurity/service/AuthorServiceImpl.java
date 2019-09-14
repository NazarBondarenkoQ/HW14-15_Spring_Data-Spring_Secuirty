package edu.cursor.springsecurity.service;

import edu.cursor.springsecurity.models.Author;
import edu.cursor.springsecurity.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author findAuthor(Integer authorID) {
        try {
            return authorRepository.findById(authorID).orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            e.printStackTrace();
        }
        return authorRepository.findById(authorID).orElse(new Author());
    }

    @Override
    public void deleteAuthor(Integer authorID) {
        authorRepository.deleteById(authorID);
    }

}
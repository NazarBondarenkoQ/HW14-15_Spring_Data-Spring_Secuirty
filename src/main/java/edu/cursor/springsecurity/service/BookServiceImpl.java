package edu.cursor.springsecurity.service;

import edu.cursor.springsecurity.models.Book;
import edu.cursor.springsecurity.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findBook(Integer bookID) {
        return bookRepository.findById(bookID).orElse(new Book());
    }

    @Override
    public void deleteBook(Integer bookID) {
        bookRepository.deleteById(bookID);
    }
}
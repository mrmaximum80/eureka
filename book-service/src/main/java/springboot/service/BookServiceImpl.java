package springboot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.model.Book;
import springboot.repository.BookRepository;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository repository;

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}

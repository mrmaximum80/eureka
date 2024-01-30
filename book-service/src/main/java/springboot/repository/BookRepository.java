package springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springboot.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}

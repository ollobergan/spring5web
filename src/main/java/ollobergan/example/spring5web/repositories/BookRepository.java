package ollobergan.example.spring5web.repositories;

import ollobergan.example.spring5web.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book,Long> {

}

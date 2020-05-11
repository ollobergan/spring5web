package ollobergan.example.spring5web.repositories;

import ollobergan.example.spring5web.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

package ollobergan.example.spring5web.repositories;

import ollobergan.example.spring5web.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

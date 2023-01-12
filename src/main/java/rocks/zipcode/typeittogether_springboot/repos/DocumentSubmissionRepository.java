package rocks.zipcode.typeittogether_springboot.repos;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.typeittogether_springboot.entities.Document;

public interface DocumentSubmissionRepository extends CrudRepository<Document, Integer> {


}

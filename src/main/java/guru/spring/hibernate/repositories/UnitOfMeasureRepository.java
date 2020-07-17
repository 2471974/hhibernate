package guru.spring.hibernate.repositories;

import guru.spring.hibernate.models.Category;
import guru.spring.hibernate.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
    Optional<UnitOfMeasure> findById(Long Id);

}

package guru.spring.hibernate.repositories;

import guru.spring.hibernate.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
    Optional<Category> findById(Long Id);



}

package guru.spring.hibernate.repositories;

import guru.spring.hibernate.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}

package guru.spring.hibernate.services;

import guru.spring.hibernate.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

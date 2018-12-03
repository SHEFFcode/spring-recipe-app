package com.sheffmachine.spring5recipe.repositories;

import com.sheffmachine.spring5recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

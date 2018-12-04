package com.sheffmachine.spring5recipe.services;

import com.sheffmachine.spring5recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}

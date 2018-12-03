package com.sheffmachine.spring5recipe.repositories;

import com.sheffmachine.spring5recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

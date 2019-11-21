package com.excilys.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.excilys.demo.model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

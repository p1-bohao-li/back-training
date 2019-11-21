package com.excilys.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excilys.demo.model.Recipe;
import com.excilys.demo.repository.RecipeRepository;

@Service
public class RecipeService {
  @Autowired
  RecipeRepository recipeRepository;

  public List<Recipe> getAll() {
    return (List<Recipe>) recipeRepository.findAll();
  }

  public void delete(Recipe recipe) {
    recipeRepository.delete(recipe);
  }

  public void deleteAll() {
    recipeRepository.deleteAll();
  }

  public void deleteById(Long id) {
    recipeRepository.deleteById(id);
  }

  public Optional<Recipe> findById(Long id) {
    return recipeRepository.findById(id);
  }

  public Recipe save(Recipe recipe) {
    return recipeRepository.save(recipe);
  }
}

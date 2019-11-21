package com.excilys.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.excilys.demo.model.Recipe;
import com.excilys.demo.service.RecipeService;

@RestController
@RequestMapping(value = "/api/v1/recipes")
public class RecipeController {

  private final RecipeService recipeService;

  public RecipeController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @GetMapping("get-all")
  public List<Recipe> getAll() {
    return recipeService.getAll();
  }

  @DeleteMapping("delete")
  public void delete(@RequestBody Recipe recipe) {
    recipeService.delete(recipe);
  }

  @DeleteMapping("delete-all")
  public void deleteAll() {
    recipeService.deleteAll();
  }

  @DeleteMapping("delete-by-id/{id}")
  public void deleteById(@PathVariable Long id) {
    recipeService.deleteById(id);
  }

  @GetMapping("get-by-id")
  public Optional<Recipe> findById(Long id) {
    return recipeService.findById(id);
  }

  @PutMapping("save")
  public Recipe save(@RequestBody Recipe recipe) {
    return recipeService.save(recipe);
  }
}

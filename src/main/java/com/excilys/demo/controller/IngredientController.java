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
import com.excilys.demo.model.Ingredient;
import com.excilys.demo.service.IngredientService;

@RestController
@RequestMapping(value = "/api/v1/ingredients")
public class IngredientController {

  private final IngredientService ingredientService;

  public IngredientController(IngredientService ingredientService) {
    this.ingredientService = ingredientService;
  }

  @GetMapping("get-all")
  public List<Ingredient> getAll() {
    return ingredientService.getAll();
  }

  @DeleteMapping("delete")
  public void delete(@RequestBody Ingredient ingredient) {
    ingredientService.delete(ingredient);
  }

  @DeleteMapping("delete-all")
  public void deleteAll() {
    ingredientService.deleteAll();
  }

  @DeleteMapping("delete-by-id/{id}")
  public void deleteById(@PathVariable Long id) {
    ingredientService.deleteById(id);
  }

  @GetMapping("get-by-id")
  public Optional<Ingredient> findById(Long id) {
    return ingredientService.findById(id);
  }

  @PutMapping("save")
  public Ingredient save(@RequestBody Ingredient ingredient) {
    return ingredientService.save(ingredient);
  }
}

package com.excilys.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excilys.demo.model.Ingredient;
import com.excilys.demo.repository.IngredientRepository;

@Service
public class IngredientService {

  @Autowired
  IngredientRepository ingredientRepository;

  public List<Ingredient> getAll() {
    return (List<Ingredient>) ingredientRepository.findAll();
  }

  public void delete(Ingredient ingredient) {
    ingredientRepository.delete(ingredient);
  }

  public void deleteAll() {
    ingredientRepository.deleteAll();
  }

  public void deleteById(Long id) {
    ingredientRepository.deleteById(id);
  }

  public Optional<Ingredient> findById(Long id) {
    return ingredientRepository.findById(id);
  }

  public Ingredient save(Ingredient ingredient) {
    return ingredientRepository.save(ingredient);
  }
}

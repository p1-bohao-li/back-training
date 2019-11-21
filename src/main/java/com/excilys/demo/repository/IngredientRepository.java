package com.excilys.demo.repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import com.excilys.demo.model.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

  List<Ingredient> getAll();

  @Override
  void delete(Ingredient ingredient);

  @Override
  void deleteAll();

  @Override
  void deleteById(Long id);

  @Override
  Optional<Ingredient> findById(Long id);

  @Override
  @SuppressWarnings("unchecked")
  Ingredient save(Ingredient ingredient);

  @Query("SELECT * FROM ingredient in WHERE in.name = :name")
  Optional<Ingredient> findIngredientByName(String name);

  @Async
  @Query
  Future<Optional<Ingredient>> findIngredientByNameAsync(String name);

  @Async
  @Query("SELECT in FROM ingredient in where in.id= :id")
  Future<Optional<String>> findIngredientByIdAsync(@Param("id") Long id);

  @Async
  @Query("SELECT in.name FROM ingredient in where in.id= :id")
  Future<Optional<String>> findIngredientNameById(@Param("id") Long id);
}

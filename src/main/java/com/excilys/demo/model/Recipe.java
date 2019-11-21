package com.excilys.demo.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String picture;
  private String description;
  private String instructions;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, instructions, name, picture);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Recipe other = (Recipe) obj;
    return Objects.equals(description, other.description) && Objects.equals(id, other.id)
        && Objects.equals(instructions, other.instructions) && Objects.equals(name, other.name)
        && Objects.equals(picture, other.picture);
  }

  @Override
  public String toString() {
    return "Recipe [id=" + id + ", name=" + name + ", picture=" + picture + ", description="
        + description + ", instructions=" + instructions + "]";
  }
}

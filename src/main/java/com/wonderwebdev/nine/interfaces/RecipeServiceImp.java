package com.wonderwebdev.nine.interfaces;

import java.util.List;
import com.wonderwebdev.nine.domain.Recipe;

public interface RecipeServiceImp {

    List<Recipe> getGlutenFreeRecipes();

    List<Recipe> getVeganRecipes();

    List<Recipe> getVeganAndGlutenFreeRecipes();

    List<Recipe> getVegetarianRecipes();

    List<Recipe> getAllRecipes();

}
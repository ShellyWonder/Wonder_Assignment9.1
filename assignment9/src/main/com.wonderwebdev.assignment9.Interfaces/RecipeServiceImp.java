package com.wonderwebdev.assignment9;

public interface RecipeServiceImp {

    List<Recipe> getGlutenFreeRecipes();

    List<Recipe> getVeganRecipes();

    List<Recipe> getVeganAndGlutenFreeRecipes();

    List<Recipe> getVegetarianRecipes();

    List<Recipe> getAllRecipes();

}
package com.wonderwebdev.nine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wonderwebdev.nine.domain.Recipe;
import com.wonderwebdev.nine.services.RecipeService;
import java.util.List;

@RestController
public class RecipeController {

    private RecipeService recipeService;

    private RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/gluten-free")
    public List<Recipe> getGlutenFreeRecipes() {
        return recipeService.getGlutenFreeRecipes();
    }

    @GetMapping("/vegan")
    public List<Recipe> getVeganRecipes() {
        return recipeService.getVeganRecipes();
    }
    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> getVeganAndGlutenFreeRecipes() {
        return recipeService.getVeganAndGlutenFreeRecipes();
    }

    @GetMapping("/vegetarian")
    public List<Recipe> getVegetarianRecipes() {
        return recipeService.getVegetarianRecipes();
    }

    @GetMapping("/all-recipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }


}
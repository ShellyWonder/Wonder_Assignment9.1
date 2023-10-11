package com.wonderwebdev.nine.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wonderwebdev.nine.domain.Recipe;
import com.wonderwebdev.nine.services.RecipeService;
import java.util.List;

@RestController
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/gluten-free")
    public ResponseEntity<List<Recipe>> getGlutenFreeRecipes() {
        List<Recipe> recipes = recipeService.getGlutenFreeRecipes();
        return ResponseEntity.ok(recipes);
    }

    @GetMapping("/vegan")
    public ResponseEntity<List<Recipe>> getVeganRecipes() {
        List<Recipe> recipes = recipeService.getVeganRecipes();
        return ResponseEntity.ok(recipes);
    }
    
    @GetMapping("/vegan-and-gluten-free")
    public ResponseEntity<List<Recipe>> getVeganAndGlutenFreeRecipes() {
        List<Recipe> recipes = recipeService.getVeganAndGlutenFreeRecipes();
        return ResponseEntity.ok(recipes);
    }

    @GetMapping("/vegetarian")
    public ResponseEntity<List<Recipe>> getVegetarianRecipes() {
        List<Recipe> recipes = recipeService.getVegetarianRecipes();
        return ResponseEntity.ok(recipes);
    }

    @GetMapping("/all-recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }

}

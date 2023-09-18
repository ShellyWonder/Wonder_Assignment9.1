package com.wonderwebdev.services.recipeService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wonderwebdev.RecipeServiceImp;
import com.wonderwebdev.domain.Recipe;

@Service
public class RecipeService extends RecipeServiceImp {
    List<Recipe> getGlutenFreeRecipes(){
        return null;}

    List<Recipe> getVeganRecipes(){
        return null;}

    List<Recipe> getVeganAndGlutenFreeRecipes(){
        return null;}

    List<Recipe> getVegetarianRecipes(){
        return null;}

    List<Recipe> getAllRecipes(){
        return null;}
}
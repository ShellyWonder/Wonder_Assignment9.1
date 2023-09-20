package com.wonderwebdev.nine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wonderwebdev.nine.interfaces.*;
import com.wonderwebdev.nine.domain.Recipe;

@Service
public class RecipeService implements RecipeServiceImp {
    @Override
    public List<Recipe> getGlutenFreeRecipes(){
        return null;
    }

    @Override
    public List<Recipe> getVeganRecipes(){
        return null;
    }

    @Override
    public List<Recipe> getVeganAndGlutenFreeRecipes(){
        return null;
    }

    @Override
    public List<Recipe> getVegetarianRecipes(){
        return null;
    }

    List<Recipe> getAllRecipes(){
        return null;}
}
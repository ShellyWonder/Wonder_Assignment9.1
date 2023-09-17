package com.wonderwebdev.assignment9.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wonderwebdev.assignment9.RecipeServiceImp;
import com.wonderwebdev.assignment9.domain;

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
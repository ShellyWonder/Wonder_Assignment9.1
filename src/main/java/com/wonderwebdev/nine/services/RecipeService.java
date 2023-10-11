package com.wonderwebdev.nine.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.wonderwebdev.nine.interfaces.*;
import com.wonderwebdev.nine.domain.Recipe;
import com.wonderwebdev.nine.exceptions.RecipeServiceException;

@Service
public class RecipeService implements RecipeServiceImp {
    private List<Recipe> recipes;

    public RecipeService() throws RecipeServiceException {
        try {
            this.recipes = readRecipesFromFile("recipes.txt");
        } catch (IOException e) {
            throw new RecipeServiceException("Error reading recipes from file", e);
        }

    }

    @Override
    public List<Recipe> getGlutenFreeRecipes() {
        return recipes.stream()
                .filter(Recipe::getGlutenFree)
                .collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getVeganRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegan)
                .collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getVeganAndGlutenFreeRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegan)
                .filter(Recipe::getGlutenFree)
                .collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getVegetarianRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegetarian)
                .collect(Collectors.toList());
    }

    public List<Recipe> getAllRecipes() {
        return recipes.stream()
                .collect(Collectors.toList());
    }

    public List<Recipe> readRecipesFromFile(String filePath) throws IOException, RecipeServiceException {
        List<Recipe> recipes = new ArrayList<>();

        Reader reader = new FileReader("recipes.txt");
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                .withIgnoreSurroundingSpaces()
                .withHeader()
                .withSkipHeaderRecord());

        for (CSVRecord csvRecord : csvParser) {
            Recipe recipe = new Recipe();
            recipe.setTitle(csvRecord.get("Title"));
            recipe.setCookingMinutes(Integer.parseInt(csvRecord.get("Cooking Minutes")));
            recipe.setDairyFree(Boolean.parseBoolean(csvRecord.get("Dairy Free")));
            recipe.setGlutenFree(Boolean.parseBoolean(csvRecord.get("Gluten Free")));
            recipe.setInstructions(csvRecord.get("Instructions"));
            recipe.setPreparationMinutes(Double.parseDouble(csvRecord.get("Preparation Minutes")));
            recipe.setPricePerServing(Double.parseDouble(csvRecord.get("Price Per Serving")));
            recipe.setReadyInMinutes(Double.parseDouble(csvRecord.get("Ready In Minutes")));
            recipe.setServings(Integer.parseInt(csvRecord.get("Servings")));
            recipe.setSpoonacularScore(Double.parseDouble(csvRecord.get("Spoonacular Score")));
            recipe.setVegan(Boolean.parseBoolean(csvRecord.get("Vegan")));
            recipe.setVegetarian(Boolean.parseBoolean(csvRecord.get("Vegetarian")));
            recipes.add(recipe);
        }

        csvParser.close();
        return recipes;

    }
}

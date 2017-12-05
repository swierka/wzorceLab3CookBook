package com.ebookfrenzy.cookbook.domain;

import com.ebookfrenzy.cookbook.entity.Recipe;
import com.ebookfrenzy.cookbook.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alicja on 26.11.2017.
 */

public class GetRecipes {

    public List<Recipe> getRightRecipes(boolean isWithMeat) {
        RecipeRepository repository= new RecipeRepository();
        List<Recipe> allRecipes = repository.getAllRecipes();
        List<Recipe> allMeatRecipes = new ArrayList<>();
        List<Recipe> allVeggieRecipes = new ArrayList<>();

        for(int i =0; i<allRecipes.size();i++){
            if(allRecipes.get(i).getMeat()==true){
                allMeatRecipes.add(allRecipes.get(i));
            } else allVeggieRecipes.add(allRecipes.get(i));
        }

        if (isWithMeat) return allMeatRecipes;
        else return allVeggieRecipes;
    }
}

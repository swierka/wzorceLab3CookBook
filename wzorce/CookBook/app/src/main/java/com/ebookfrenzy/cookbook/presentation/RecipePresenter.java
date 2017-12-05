package com.ebookfrenzy.cookbook.presentation;

import com.ebookfrenzy.cookbook.RecipeView;
import com.ebookfrenzy.cookbook.domain.GetRecipes;
import com.ebookfrenzy.cookbook.entity.Recipe;
import com.ebookfrenzy.cookbook.repository.RecipeRepository;

import java.util.List;

/**
 * Created by Alicja on 26.11.2017.
 */

public class RecipePresenter {
    private RecipeRepository repository;
    private GetRecipes getRecipes;
    private RecipeView recipeView;

    public void onAttach(RecipeView recipeView){
        this.recipeView = recipeView;
    }

    public void onDetach(){
        recipeView=null;
    }

    public List<Recipe> showRecipes(boolean meat){
        List<Recipe> recipes = getRecipes.getRightRecipes(meat);
        return recipes;
        }

    public List<Recipe> getAllRecipes (){
        List<Recipe> allRecipes = repository.getAllRecipes();
        return allRecipes;
    }

    public void onRefreshClicked(boolean veggie) {
        if(veggie){
            showRecipes(false);
        } else { showRecipes(true);}
    }
}

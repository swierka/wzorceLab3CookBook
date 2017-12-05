package com.ebookfrenzy.cookbook;

import com.ebookfrenzy.cookbook.entity.Recipe;

import java.util.List;

/**
 * Created by Alicja on 26.11.2017.
 */

public interface RecipeView {

    public void showRecipes(List<Recipe> recipes);

}

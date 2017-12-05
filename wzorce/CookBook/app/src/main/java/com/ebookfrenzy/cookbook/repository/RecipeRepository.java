package com.ebookfrenzy.cookbook.repository;

import com.ebookfrenzy.cookbook.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alicja on 26.11.2017.
 */

public class RecipeRepository {

    public List<Recipe>getAllRecipes(){
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Pierogi z mięsem","Pyszne pierogi z wołowiną i sosem",true));
        recipes.add(new Recipe("Falafel","Truecki falafel z sosem jogurtowym",false));
        recipes.add(new Recipe("Pizza z kurczakiem","Pizza włoska z kurczakiem i z sosem pomidorowym",true));
        recipes.add(new Recipe("Schabowy","Kotlet wieprzowy z ziemniakami",true));
        recipes.add(new Recipe("Pasta z pesto","Makaron z sosem z bazylii i orzechów pinii",false));
        recipes.add(new Recipe("Zupa cebulowa","Zupa z cebulii",false));
        return recipes;
    }
}

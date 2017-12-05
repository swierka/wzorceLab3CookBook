package com.ebookfrenzy.cookbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.lang.StringBuilder;


import com.ebookfrenzy.cookbook.entity.Recipe;
import com.ebookfrenzy.cookbook.presentation.RecipePresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecipeView {
    private RecipePresenter presenter;
    private TextView lista;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new RecipePresenter();
        presenter.onAttach(this);

        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        lista = (TextView) findViewById(R.id.textView);

        Button odswiez = (Button) findViewById(R.id.button);
        odswiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onRefreshClicked(checkBox.isChecked());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }

    @Override
    public void showRecipes(List<Recipe> recipes) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Recipe> listToShow = presenter.getAllRecipes();

        for (Recipe recipe : listToShow) {
           stringBuilder.append(recipe+"; ");
        }
        lista.setText(stringBuilder);
    }
}

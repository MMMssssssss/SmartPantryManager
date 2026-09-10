package com.marushka.smartpantrymanager;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.marushka.smartpantrymanager.activities.PantryActivity;


public class SuggestedRecipesActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suggested_recipes);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_recipe);


        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_recipe) {
                Intent intent = new Intent(SuggestedRecipesActivity.this, SuggestedRecipesActivity.class);
                startActivity(intent);

                return true;

            } else if (item.getItemId() == R.id.nav_settings) {
                Intent intent = new Intent(SuggestedRecipesActivity.this, SettingsActivity.class);
                startActivity(intent);

                return true;
            } else if (item.getItemId() == R.id.nav_pantry) {
                Intent intent = new Intent(SuggestedRecipesActivity.this, PantryActivity.class);
                startActivity(intent);
                return true;
            }

            return false;
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

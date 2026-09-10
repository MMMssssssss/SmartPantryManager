package com.marushka.smartpantrymanager.activities;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.marushka.smartpantrymanager.R;
import com.marushka.smartpantrymanager.SettingsActivity;
import com.marushka.smartpantrymanager.SuggestedRecipesActivity;

public class PantryActivity extends AppCompatActivity {

    BottomNavigationView  bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantry);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_pantry);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_recipe){
                Intent intent = new Intent(PantryActivity.this, SuggestedRecipesActivity.class);
                startActivity(intent);

                return true;

            } else if (item.getItemId() == R.id.nav_settings){
                Intent intent = new Intent(PantryActivity.this, SettingsActivity.class);
                startActivity(intent);

                return true;
            }

            return false;
        });


    }


    }


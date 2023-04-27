package com.android.marketplace_nisar_school.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.android.marketplace_nisar_school.R;
import com.android.marketplace_nisar_school.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    NavController navController;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        bottomNavigationView = findViewById(R.id.bottom_nav);

        navController = Navigation.findNavController(this, R.id.fragment);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        //bottom navigation setup
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if (destination.getId() == R.id.homeFragment2) {
                bottomNavigationView.setVisibility(View.VISIBLE);
            } else if (destination.getId() == R.id.favoritesFragment2) {
                bottomNavigationView.setVisibility(View.VISIBLE);
            } else if (destination.getId() == R.id.settingsFragment2) {
                bottomNavigationView.setVisibility(View.VISIBLE);
            } else {
                bottomNavigationView.setVisibility(View.GONE);
            }
        });
    }
}
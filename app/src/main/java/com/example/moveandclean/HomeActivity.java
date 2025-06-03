package com.example.moveandclean;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Sets the main layout for the Activity

        // 1. Get reference to your BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);

        // 2. Find the NavHostFragment that hosts your navigation graph
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);

        // Check if navHostFragment is found to avoid NullPointerException
        if (navHostFragment != null) {
            // 3. Get the NavController from the NavHostFragment
            NavController navController = navHostFragment.getNavController();

            // 4. Link the BottomNavigationView with the NavController
            // This line automatically handles clicks on bottom nav items and navigates
            // to the corresponding fragment defined in nav_graph.xml based on matching IDs.
            NavigationUI.setupWithNavController(bottomNavigationView, navController);
        }
    }
}

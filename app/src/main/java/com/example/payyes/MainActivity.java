package com.example.payyes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.payyes.Fragment.HomeFragment;
import com.example.payyes.Fragment.TransactionFragment;
import com.example.payyes.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,
                new HomeFragment()).commit();

        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.nav_category:
                        selectedFragment = new TransactionFragment();
                        break;

                    /*case R.id.nav_profile:
                        selectedFragment = new ProfileFragment();
                        break;*/
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,
                        selectedFragment).commit();


                return true;
            }
        });

    }
}
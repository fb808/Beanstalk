package com.example.beanstalk;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView;
        final Fragment1 fragment1;
        final Fragment2 fragment2;
        final Fragment3 fragment3;

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_layout, fragment1).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.tab1: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout, fragment1).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.tab2: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout, fragment2).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.tab3: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout, fragment3).commitAllowingStateLoss();
                        return true;
                    }

                    default:
                        return false;
                }
            }
        });
    }
}

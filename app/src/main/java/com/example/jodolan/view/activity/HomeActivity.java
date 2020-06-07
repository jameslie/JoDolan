package com.example.jodolan.view.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.jodolan.view.fragment.AkunFragment;
import com.example.jodolan.view.fragment.HomeFragment;
import com.example.jodolan.R;
import com.example.jodolan.view.fragment.NewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private Fragment selectedFragment = new HomeFragment();
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.activitymain_bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(selectedFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_bottomnav_home:
                selectedFragment = new HomeFragment();
                loadFragment(selectedFragment);
                break;
            case  R.id.menu_berita:
                selectedFragment = new NewsFragment();
                loadFragment(selectedFragment);
                break;

            case R.id.menu_bottomnav_akun:
                selectedFragment = new AkunFragment();
                loadFragment(selectedFragment);
                break;
        }
        return loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment selectedFragment) {
        if (selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .setCustomAnimations(R.anim.enter_right_to_left, R.anim.exit_right_to_left, R.anim.enter_left_to_right,
                            R.anim.exit_left_to_right)
                    .replace(R.id.activitymain_fragmentcontainer, selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }


}

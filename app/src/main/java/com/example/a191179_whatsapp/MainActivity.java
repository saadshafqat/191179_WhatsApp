package com.example.a191179_whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        BottomNavigationView bottNav = findViewById(R.id.navbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentlayout,new chats()).commit();

        bottNav.setOnNavigationItemSelectedListener(navListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedfragment = null;

            switch (item.getItemId())
            {
                case R.id.chat: {
                    selectedfragment = new chats();
                    break;
                }
                case R.id.status: {
                    selectedfragment = new status();
                    break;
                }
                case R.id.calls: {
                    selectedfragment = new calls();
                    break;
                }
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentlayout,selectedfragment).commit();

            return true;
        }
    };
}
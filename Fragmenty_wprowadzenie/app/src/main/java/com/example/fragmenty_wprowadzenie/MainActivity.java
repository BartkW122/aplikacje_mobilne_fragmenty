package com.example.fragmenty_wprowadzenie; // Zmień na swój pakiet

import androidx.appcompat.app.AppCompatActivity; // Lub FragmentActivity
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loadButton1 = findViewById(R.id.button);
        Button loadButton2 = findViewById(R.id.button2);

        loadButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSimpleFragment1();
            }
        });

        loadButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSimpleFragment2();
            }
        });

    }

    private void loadSimpleFragment1() {

        Fragment simpleFragment = new fragment_a();


        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        fragmentTransaction.replace(R.id.fragment_container_dynamic, simpleFragment);

        fragmentTransaction.commit();
    }

    private void loadSimpleFragment2() {

        Fragment simpleFragment = new fragment_b();


        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        fragmentTransaction.replace(R.id.fragment_container_dynamic, simpleFragment);

        fragmentTransaction.commit();
    }
}
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

        Button loadButtona = findViewById(R.id.button);
        Button loadButtonb = findViewById(R.id.button2);
        Button loadButtonc = findViewById(R.id.button3);

        loadButtona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_a(),false);
            }
        });

        loadButtonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_b(),true);
            }
        });

        loadButtonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { loadFragment(new fragment_c(),true); }
        });

        if(savedInstanceState == null){
            loadFragment(new fragment_a(),false);
        }
    }
    private  void  loadFragment(Fragment fragment,boolean addToBackStack){
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container_dynamic,fragment);

        if(addToBackStack){
            fragmentTransaction.addToBackStack(null);
        }

        fragmentTransaction.commit();
    }

    /*private void loadSimpleFragmenta() {

        Fragment simpleFragment = new fragment_a();


        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        fragmentTransaction.replace(R.id.fragment_container_dynamic, simpleFragment).addToBackStack(null);

        fragmentTransaction.commit();
    }

    private void loadSimpleFragmentb() {

        Fragment simpleFragment = new fragment_b();


        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        fragmentTransaction.add(R.id.fragment_container_dynamic, simpleFragment).addToBackStack(null);

        fragmentTransaction.commit();
    }

    private void loadSimpleFragmentc() {

        Fragment simpleFragment = new fragment_c();


        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        fragmentTransaction.add(R.id.fragment_container_dynamic, simpleFragment).addToBackStack(null);

        fragmentTransaction.commit();
    }*/
}
package com.example.as_project1222;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private FirstFragment FF;
    private SecondFragment SF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(btn1OnClick);
        btn2.setOnClickListener(btn2OnClick);

        FF = new FirstFragment();
        SF = new SecondFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.FL1, FF, "FirstFragment")
                .add(R.id.FL1, SF, "SecondFragment")
                .hide(FF)
                .hide(SF)
                .commit();

    }
    private View.OnClickListener btn1OnClick = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.xml.trans_in, R.xml.no_anim)
                    .show(FF).setCustomAnimations(R.xml.no_anim, R.xml.trans_out)
                    .hide(SF)
                    .commit();
        }
    };
    private View.OnClickListener btn2OnClick = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.xml.trans_in, R.xml.no_anim)
                    .show(SF).setCustomAnimations(R.xml.no_anim, R.xml.trans_out)
                    .hide(FF).commit();
        }
    };
}
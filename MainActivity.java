package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import andriod.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText getGender,getAge;
    private TextView getResult;
    private Button getButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getGender=findViewById(R.id.gender);
        getAge=findViewById(R.id.age);
        getButton=findViewById(R.id.btn1);
        getResult=findViewById(R.id.result);

        getButton.setOnClickListener(btnClicked);
    }

    private View.OnClickListener btnClicked=new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            String gender=getGender.getText().toString();
            getGender.setText("Hello");
        }
    };
}
package com.example.hse_homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    Button saveButton;
    TextInputEditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        saveButton = findViewById(R.id.buttonSave);
        text = findViewById(R.id.editText);

        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity2.this, MainActivity.class);
                String s = text.getText().toString();
                myintent.putExtra(String.valueOf("key"), s);
                startActivity(myintent);
            }
        });
    }
}
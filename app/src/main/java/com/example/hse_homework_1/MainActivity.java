package com.example.hse_homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button activitybutton;
    Button searchButton;
    TextView recivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activitybutton = findViewById(R.id.activity_button);
        searchButton = findViewById(R.id.SearchButton);
        recivedText = findViewById(R.id.showText);

        
        Intent received = getIntent();
        String str = received.getStringExtra("key");
        recivedText.setText(str);

        activitybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(myintent);
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, str);
                startActivity(intent);
                }
        });


    }


}
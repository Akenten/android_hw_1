package com.example.hse_homework_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button activitybutton;
    Button mapButton;
    Button counterButton;
    TextView recivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activitybutton = findViewById(R.id.activity_button);
        mapButton = findViewById(R.id.mapButton);

        recivedText = findViewById(R.id.showText);

        String c = "";


        
        
        Intent received = getIntent();
       // c = received.getStringExtra("counter");
        Toast.makeText(MainActivity.this, c, Toast.LENGTH_LONG).show();
        String str = received.getStringExtra("key");
        recivedText.setText(str);
        activitybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(myintent);

            }
        });
        mapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, str); // query contains search string
                startActivity(intent);
                }

        });





    }


}
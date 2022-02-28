package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class register_app extends AppCompatActivity {
    TextView textOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_app);
        getSupportActionBar().hide();
        textOne = (TextView) findViewById(R.id.logText);

        textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register_app.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
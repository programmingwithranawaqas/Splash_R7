package com.example.splash_r7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvResult = findViewById(R.id.tvResult);

        String text = getIntent().getStringExtra("key_id")+"\n"+
        getIntent().getStringExtra("key_name");
        tvResult.setText(text);

    }
}
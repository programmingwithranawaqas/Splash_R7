package com.example.splash_r7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText etName, etId;
    Button btnSubmit, btnCancel;
    LinearLayout llGetInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llGetInfo=findViewById(R.id.llGetInfo);
        btnCancel=findViewById(R.id.btnCancel);
        btnSubmit=findViewById(R.id.btnSubmit);
        etName=findViewById(R.id.etName);
        etId=findViewById(R.id.etId);
        llGetInfo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slogan_anim));

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = etId.getText().toString().trim();
                String name = etName.getText().toString().trim();
                Intent i = new Intent(MainActivity.this, Home.class);

                i.putExtra("key_id", id);
                i.putExtra("key_name", name);

                startActivity(i);
                finish();

            }
        });


    }
}
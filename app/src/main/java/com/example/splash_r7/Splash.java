package com.example.splash_r7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView ivLogo;
    TextView tvSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ivLogo = findViewById(R.id.ivLogo);
        tvSlogan = findViewById(R.id.tvSlogan);

        Animation logo_animation = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        Animation slogan_animation = AnimationUtils.loadAnimation(this, R.anim.slogan_anim);
        ivLogo.setAnimation(logo_animation);
        tvSlogan.setAnimation(slogan_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);




    }
}
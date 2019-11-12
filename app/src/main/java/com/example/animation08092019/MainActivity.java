package com.example.animation08092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAlpha,imgScale1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgScale1 = findViewById(R.id.imageviewScale1);

        //1 : Alpha
//        final AlphaAnimation alphaAnimation = (AlphaAnimation) AnimationUtils.loadAnimation(this,R.anim.anim_alpha);

        // auto boxing
//        int a = 5;
//        Integer b = a + 1;
//        alphaAnimation.setFillBefore(true);
//        imgAlpha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                v.startAnimation(alphaAnimation);
//            }
//        });

        //2 : Scale
        final Animation animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        imgScale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationScale);
            }
        });

    }
}

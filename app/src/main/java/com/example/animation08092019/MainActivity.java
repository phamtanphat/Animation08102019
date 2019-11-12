package com.example.animation08092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAlpha,imgScale1,imgScale2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgScale1 = findViewById(R.id.imageviewScale1);
        imgScale2 = findViewById(R.id.imageviewScale2);

        imgScale2.setVisibility(View.GONE);

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
        // pivotx < 50 : thi scale qua phai va nguoc lai
        // pivoty < 50 : thi scale xuong duoi va nguoc lai
        final Animation animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        final Animation animationAlphaGrab = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);

        imgScale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationScale);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgScale2.setVisibility(View.VISIBLE);
                        imgScale2.startAnimation(animationAlphaGrab);
                    }
                },animationScale.getDuration());
            }
        });

    }
}

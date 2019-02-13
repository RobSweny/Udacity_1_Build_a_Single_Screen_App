package com.example.udacityproject1_buildasinglescreenapp;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    private ImageView circle;
    private ImageView left_cloud;
    private ImageView right_cloud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize
        circle = findViewById(R.id.circle);
        left_cloud = findViewById(R.id.left_cloud);
        right_cloud = findViewById(R.id.right_cloud);

        // Load up animations
        Animation sunrise = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top_anim);
        Animation left_cloud_move = AnimationUtils.loadAnimation(this, R.anim.left_to_right_anim);
        Animation right_cloud_move = AnimationUtils.loadAnimation(this, R.anim.right_to_left_anim);

        // Start animations
        circle.startAnimation(sunrise);
        left_cloud.startAnimation(left_cloud_move);
        right_cloud.startAnimation(right_cloud_move);


    }
}

package com.test.testanim;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.myset);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.myset2);

        View.OnClickListener onClickListenerForButton = view -> textView.startAnimation(animation);
        View.OnClickListener onClickListenerForButton2 = view -> textView.startAnimation(animation2);

        button.setOnClickListener(onClickListenerForButton);
        button2.setOnClickListener(onClickListenerForButton2);
    }
}
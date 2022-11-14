package com.example.listencarefree;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_guide);
    }

    public void on0to4(View v){
        final ImageView image = findViewById(R.id.guide_default);

        ImageView btn = findViewById(R.id.guide_0to4);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                image.setImageResource(R.drawable.g_04);
            }
        });
    }

    public void on2to5(View v){
        final ImageView image = findViewById(R.id.guide_default);

        ImageView btn = findViewById(R.id.guide_2to5);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                image.setImageResource(R.drawable.g_25);
            }
        });
    }

    public void on5to2(View v){
        final ImageView image = findViewById(R.id.guide_default);

        ImageView btn = findViewById(R.id.guide_5to2);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                image.setImageResource(R.drawable.g_52);
            }
        });
    }

}

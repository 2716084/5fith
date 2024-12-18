package com.example.myapplicationttt;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
        private ImageView imageView;
        private ImageButton nextButton, prevButton;


        private int[] images = {
                R.drawable.im1,
                R.drawable.im2,
                R.drawable.im3,
                R.drawable.im4,
                R.drawable.im5
        };

        private int currentInde = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageView = findViewById(R.id.imageView);
            nextButton = findViewById(R.id.nextButton);
            prevButton = findViewById(R.id.prevButton);


            nextButton.setOnClickListener(v -> {
                currentInde = (currentInde + 1) % images.length;
                imageView.setImageResource(images[currentInde]);
            });


            prevButton.setOnClickListener(v -> {
                currentInde = (currentInde - 1 + images.length) % images.length;
                imageView.setImageResource(images[currentInde]);

            });

        }
}
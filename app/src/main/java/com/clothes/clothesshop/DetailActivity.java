package com.clothes.clothesshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    Button plusButton, minusButton, buyButton;
    TextView buyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        imageView = findViewById(R.id.detail_image);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);
        buyButton = findViewById(R.id.bye_button);
        imageView = findViewById(R.id.detail_image);
        buyText = findViewById(R.id.count_text);
        int imagePath = getIntent().getIntExtra("IMAGE_PATH", 0);
        imageView.setImageResource(imagePath);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = buyText.getText().toString();
                try{
                    int number = Integer.parseInt(str);
                    int total = number + 1;
                    buyText.setText(String.valueOf(total));
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = buyText.getText().toString();
                try{
                    int number = Integer.parseInt(str);
                    int minus = 0;
                    if (number > 0){
                        minus = number - 1;
                    }
                    buyText.setText(String.valueOf(minus));
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
        });
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
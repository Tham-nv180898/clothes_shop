package com.food.foodapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.facebook.shimmer.ShimmerFrameLayout;

public class FavouriteActivity extends AppCompatActivity {
    ShimmerFrameLayout shimmerFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        shimmerFrameLayout = findViewById(R.id.shimmerFrameLayout);
        shimmerFrameLayout.startShimmerAnimation();
    }
}
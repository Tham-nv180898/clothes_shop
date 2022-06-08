package com.clothes.clothesshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class ListedClothesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelItems> listedItem;
    ClothesAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listed_clothes);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        Toast.makeText(this, "Is Updating!......", Toast.LENGTH_SHORT).show();
        recyclerView =findViewById(R.id.recyclerview);
        listedItem = new ArrayList<>();

        listedItem.add(new ModelItems(R.drawable.image1, "t-shirt model 1", "100.00"));
        listedItem.add(new ModelItems(R.drawable.image2, "t-shirt model 2", "150.00"));
        listedItem.add(new ModelItems(R.drawable.image3, "t-shirt model 3", "90.00"));
        listedItem.add(new ModelItems(R.drawable.image4, "t-shirt model 4", "110.00"));
        listedItem.add(new ModelItems(R.drawable.image5, "t-shirt model 5", "130.00"));
        listedItem.add(new ModelItems(R.drawable.image6, "t-shirt model 6", "120.00"));

        foodAdapter = new ClothesAdapter(ListedClothesActivity.this, listedItem);
        recyclerView.setAdapter(foodAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(ListedClothesActivity.this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        RecyclerView.LayoutManager layoutManager = manager;
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
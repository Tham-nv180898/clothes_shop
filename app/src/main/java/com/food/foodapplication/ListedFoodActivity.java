package com.food.foodapplication;

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

public class ListedFoodActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelItems> listedItem;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listed_food);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        Toast.makeText(this, "Is Updating!......", Toast.LENGTH_SHORT).show();
        recyclerView =findViewById(R.id.recyclerview);
        listedItem = new ArrayList<>();

        listedItem.add(new ModelItems(R.drawable.hamburger, "Hamburger"));
        listedItem.add(new ModelItems(R.drawable.bread, "Bread"));
        listedItem.add(new ModelItems(R.drawable.nacho_cake, "Nacho Cake"));
        listedItem.add(new ModelItems(R.drawable.header_food, "Noodle"));
        listedItem.add(new ModelItems(R.drawable.piza_cake, "Pizza Cake"));
        listedItem.add(new ModelItems(R.drawable.bbq, " Barbecue"));

        foodAdapter = new FoodAdapter(ListedFoodActivity.this, listedItem);
        recyclerView.setAdapter(foodAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(ListedFoodActivity.this);
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
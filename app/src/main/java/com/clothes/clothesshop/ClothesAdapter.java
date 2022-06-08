package com.clothes.clothesshop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesAdapter.Holder> {

    private Context context;
    private ArrayList<ModelItems> list;

    public ClothesAdapter(Context context, ArrayList<ModelItems> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ClothesAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new Holder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ClothesAdapter.Holder holder, int position) {
        ModelItems modelItems = list.get(position);
        holder.imgView.setImageResource(modelItems.getImagePath());
        holder.titleView.setText(modelItems.getTitle());
        holder.priceText.setText(holder.priceText.getText() + modelItems.getPrice());
        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("IMAGE_PATH", modelItems.getImagePath());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView titleView, priceText;

        public Holder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.price_image);
            titleView = itemView.findViewById(R.id.title_text);
            priceText = itemView.findViewById(R.id.price_text);
        }
    }
}

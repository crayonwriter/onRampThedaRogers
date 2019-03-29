package com.onramp.android.takehome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewCategoriesAdapter extends RecyclerView.Adapter {
    public RecyclerViewCategoriesAdapter(Context context, ArrayList<Categories> categoriesList) {
        this.categoriesList = categoriesList;
        this.context = context;
    }

    private ArrayList<Categories> categoriesList;
    private Context context;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categories_item, null);

        )
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

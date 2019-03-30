package com.onramp.android.takehome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;

public class RecyclerViewCategoriesAdapter extends RecyclerView.Adapter<RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder> {
    public RecyclerViewCategoriesAdapter(Context context, ArrayList<Categories> categoriesList) {
        this.categoriesList = categoriesList;
        this.context = context;
    }

    private ArrayList<Categories> categoriesList;
    private Context context;


    @Override
    public RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class RecyclerViewCategoriesViewHolder extends RecyclerView.ViewHolder {

        public RecyclerViewCategoriesViewHolder(View itemView) {
            super(itemView);
        }
    }
}

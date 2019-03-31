package com.onramp.android.takehome;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;

public class RecyclerViewCategoriesAdapter extends RecyclerView.Adapter<RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder> {
    ArrayList<Categories> mCategoriesArrayList;
    Context mContext;

    //Constructor
    public RecyclerViewCategoriesAdapter(Context context, ArrayList<Categories> arrayList) {
        mCategoriesArrayList = arrayList;
        mContext = context;
    }

    @Override
    public RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_item, parent, false);
        RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder viewHolder = new RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder(layoutView);
        return new RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewCategoriesAdapter.RecyclerViewCategoriesViewHolder holder, int position) {
        Categories object = mCategoriesArrayList.get(position);

        Image image = object.getCategoryImage();

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

package com.onramp.android.takehome;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        Context context = mContext;
        int mDrawableId = context.getResources().getIdentifier("image", "drawable", context.getPackageName());

        Categories object = mCategoriesArrayList.get(position);

        int image = object.getCategoryImage();
        String webAddress = object.getCategoryClickedLocation();
        String name = object.getCategoryName();

        holder.imageView.setImageResource(mDrawableId);
        holder.webAddressTextView.setText(webAddress);
        holder.nameTextView.setText(name);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerViewCategoriesViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView webAddressTextView;
        TextView nameTextView;
        Context context = mContext;
        int mDrawableId = context.getResources().getIdentifier("image", "drawable", context.getPackageName());


        public RecyclerViewCategoriesViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.category_image);
            webAddressTextView = (TextView) itemView.findViewById(R.id.category_webAddress);
            nameTextView = (TextView) itemView.findViewById(R.id.category_text);
        }
    }
}

package com.onramp.android.takehome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategoriesArrayAdapter extends ArrayAdapter<Categories> {
    private Context mContext;
    private List<Categories> categoriesList = new ArrayList<>();


    public CategoriesArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Categories> categoriesList) {
        super(context, 0, categoriesList);
        mContext = context;
            }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View categoriesItem = convertView;
        if (categoriesItem == null) {
            categoriesItem = LayoutInflater.from(mContext).inflate(R.layout.categories_item, parent, false);
        }

        Categories currentCategory = categoriesList.get(position);

        ImageView categoryImage = (ImageView) categoriesItem.findViewById(R.id.category_image);
        categoryImage.setImageResource(currentCategory.getCategoryImage());

        TextView categoryText = (TextView) categoriesItem.findViewById(R.id.category_text);
        categoryText.setText(currentCategory.getCategoryName());

        TextView categoryWebAddress = (TextView) categoriesItem.findViewById(R.id.category_webAddress);
        categoryWebAddress.setText(currentCategory.getCategoryClickedLocation());

        return categoriesItem;
    }
}


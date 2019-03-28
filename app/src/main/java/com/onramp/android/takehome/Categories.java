package com.onramp.android.takehome;

import java.util.ArrayList;

public class Categories {
//These are the details of the Categories object: An image, a web address, a fragment?, and the name of the category

    //The id of the image
    private int mCategoryImage;

    //The website or fragment that will open when clicked on, when it becomes clickable
    private String mCategoryClickedLocation;

    //The category name
    private String mCategoryName;

    //Constructor
    public Categories(int categoryImage, String categoryClickedLocation, String categoryName) {
    }

    //Getters and Setters
    public int getCategoryImage() {
        return mCategoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        mCategoryImage = categoryImage;
    }

    public String getCategoryClickedLocation() {
        return mCategoryClickedLocation;
    }

    public void setCategoryClickedLocation(String categoryClickedLocation) {
        mCategoryClickedLocation = categoryClickedLocation;
    }

    public String getCategoryName() {
        return mCategoryName;
    }

    public void setCategoryName(String categoryName) {
        mCategoryName = categoryName;
    }
}


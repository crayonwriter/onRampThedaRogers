package com.onramp.android.takehome;

import android.media.Image;

import java.util.ArrayList;

public class Categories {

//These are the details of the Categories object: An image, a web address, a fragment?, and the name of the category

    //The id of the image
    private Image mCategoryImage;

    //The website or fragment that will open when clicked on, when it becomes clickable
    private String mCategoryClickedLocation;

    //The category name
    private String mCategoryName;

    //Constructor
    public Categories(Image categoryImage, String categoryClickedLocation, String categoryName) {
        mCategoryImage = categoryImage;
        mCategoryClickedLocation = categoryClickedLocation;
        mCategoryName = categoryName;
    }

    //Getters and Setters
    public Image getCategoryImage() {
        return mCategoryImage;
    }

    public void setCategoryImage(Image categoryImage) {
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


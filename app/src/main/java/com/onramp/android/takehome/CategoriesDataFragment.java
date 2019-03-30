package com.onramp.android.takehome;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriesDataFragment extends Fragment {
    RecyclerView recyclerView;


    public CategoriesDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }

    private ArrayList<Categories> getCategoriesArrayList() {
        ArrayList<Categories> categoriesArrayList = new ArrayList<>();
        categoriesArrayList.add(new Categories(R.drawable.grindylow,"www.crayonwriter.com", "Theda"  ));
return categoriesArrayList;
    }

}

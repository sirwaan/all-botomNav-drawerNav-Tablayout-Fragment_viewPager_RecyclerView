package com.sirwansoft.newall.fragmentTabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sirwansoft.newall.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab5 extends Fragment {


    public Tab5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_tab5, container, false);



        return view;

    }

}

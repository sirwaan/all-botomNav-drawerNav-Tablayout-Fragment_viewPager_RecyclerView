package com.sirwansoft.newall.fragmentsBotton;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.sirwansoft.newall.R;
import com.sirwansoft.newall.adapters.ViewPagerAdapterForTablayout;
import com.sirwansoft.newall.fragmentTabs.Tab1;
import com.sirwansoft.newall.fragmentTabs.Tab2;
import com.sirwansoft.newall.fragmentTabs.Tab3;


public class Frag_B_One extends Fragment {


    TabLayout tabLayout;
    ViewPager viewPager;

    public Frag_B_One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_frag__b__one, container, false);


        tabLayout=view.findViewById(R.id.tablayout_in_bottom_Nav1);
        viewPager=view.findViewById(R.id.viewPager_in_bottom_Nav1);

        ViewPagerAdapterForTablayout adapter = new ViewPagerAdapterForTablayout(getChildFragmentManager()); //>>in fragment we use this code

        // this is Tab Fragments
        adapter.AddFragment(new Tab1(),"One");
        adapter.AddFragment(new Tab2(),"Two");
        adapter.AddFragment(new Tab3(),"Three");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



        return view;
    }

}
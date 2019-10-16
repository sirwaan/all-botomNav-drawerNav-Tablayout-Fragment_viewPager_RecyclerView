package com.sirwansoft.newall.adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterForTablayout extends FragmentPagerAdapter {



    private final List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public ViewPagerAdapterForTablayout(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);


    }
    public void AddFragment(Fragment fragment, String titles) {
        FragmentList.add(fragment);
        FragmentListTitles.add(titles);
    }
}

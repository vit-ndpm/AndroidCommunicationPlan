package com.degs.communicationplan;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class DEOFragment extends Fragment {
Context context;
   ViewPager viewPager;
    TabLayout tabLayout;

    public DEOFragment() {

        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_d_e_o, container, false);
        viewPager =(ViewPager) rootView.findViewById(R.id.deoViewPager);

        tabLayout = (TabLayout) rootView.findViewById(R.id.deoTabLayout);
        // Inflate the layout for this fragment
        PipariyaFragment.DeoViewPagerAdapter adapter=
                new PipariyaFragment.DeoViewPagerAdapter(this.getActivity().getSupportFragmentManager(),1);
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);
        return inflater.inflate(R.layout.fragment_d_e_o, container, false);

    }
}
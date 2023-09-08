package com.degs.communicationplan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PipariyaFragment extends Fragment {


    public PipariyaFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pipariya, container, false);
    }

    public static class DeoViewPagerAdapter extends FragmentPagerAdapter {
        public DeoViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new DeoOfficeFragment();
                case 1:
                    return new DeoNodalFragment();
                case 2:
                    return new DeoTeamsFragment();

            }
            return null;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return super.getPageTitle(position);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
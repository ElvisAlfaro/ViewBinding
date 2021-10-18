package com.example.viewbinding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewbinding.databinding.FragmentDemmoBinding;

public class DemmoFragment extends Fragment {
    private FragmentDemmoBinding demmoBinding;

    public DemmoFragment() {
        // Required empty public constructor
    }

    public static DemmoFragment newInstance() {
        DemmoFragment fragment = new DemmoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        demmoBinding = FragmentDemmoBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return demmoBinding.getRoot();
    }
}
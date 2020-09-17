package com.gacrnd.gcs.materialdesign.viewpager2.fragment;

import android.os.Bundle;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gacrnd.gcs.materialdesign.coordinator.adapter.AuthorRecyclerAdapter;
import com.gacrnd.gcs.materialdesign.coordinator.bean.AuthorInfo;
import com.gacrnd.gcs.materialdesign.databinding.Fragment1Binding;

public class OneFragment extends Fragment {


    private Fragment1Binding binding;

    public static Fragment newIntance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(getLayoutInflater(),container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(new AuthorRecyclerAdapter(AuthorInfo.createTestData()));

    }



}

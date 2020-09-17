package com.gacrnd.gcs.materialdesign.viewpager2.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gacrnd.gcs.materialdesign.R;
import com.gacrnd.gcs.materialdesign.coordinator.adapter.AuthorRecyclerAdapter;
import com.gacrnd.gcs.materialdesign.coordinator.bean.AuthorInfo;
import com.gacrnd.gcs.materialdesign.databinding.Fragment2Binding;

public class TwoFragment extends Fragment {

    private Fragment2Binding binding;

    public static Fragment newIntance() {
        TwoFragment fragment = new TwoFragment();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //binding = DataBindingUtil.inflate(inflater, R.layout.fragment_2, container, false);
        binding = Fragment2Binding.inflate(getLayoutInflater(),container,false);
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

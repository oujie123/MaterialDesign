package com.gacrnd.gcs.materialdesign.tab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gacrnd.gcs.materialdesign.databinding.ActivityTabBinding;

public class TabActivity extends AppCompatActivity {

    private ActivityTabBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
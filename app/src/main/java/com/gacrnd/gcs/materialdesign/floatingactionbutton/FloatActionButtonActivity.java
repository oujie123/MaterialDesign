package com.gacrnd.gcs.materialdesign.floatingactionbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gacrnd.gcs.materialdesign.databinding.ActivityFloatActionButtonBinding;
import com.google.android.material.snackbar.Snackbar;

public class FloatActionButtonActivity extends AppCompatActivity {

    private ActivityFloatActionButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFloatActionButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Hello floatingactionbutton...",Snackbar.LENGTH_LONG)
                        .setAction("取消", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(FloatActionButtonActivity.this, "取消", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
    }
}
package com.example.docbook.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.docbook.R;
import com.example.docbook.databinding.ActivityDoctorProfileBinding;

public class DoctorProfileActivity extends AppCompatActivity {
private ActivityDoctorProfileBinding binding;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDoctorProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.profilePic.setImageResource(R.raw.dr);



    }

}
package com.example.docbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.docbook.databinding.ActivityEditProfileBinding;

public class EditProfileActivity extends AppCompatActivity {
private ActivityEditProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEditProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.isDoctor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId!=R.id.doctor){
                    binding.linearLayout4.setVisibility(View.GONE);
                }
                else {
                    binding.linearLayout4.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void save(View view) {
    }
}
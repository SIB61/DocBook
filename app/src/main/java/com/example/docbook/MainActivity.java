package com.example.docbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.docbook.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ArrayList<DoctorData> listData1 = new ArrayList<>();
        DoctorData topDoctorListData = new DoctorData("Dr. Tasnim Choia", "UAMC", "Mbbs from UAMC, FCPS , Heart specialist", "heart", R.raw.dr);
        for (int i = 0; i < 10; i++) listData1.add(topDoctorListData);
        binding.doctorListId.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.doctorListId.setAdapter(new TopDrListAdapter(listData1));

        binding.all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  startActivity(new Intent(MainActivity.this,DoctorListActivity.class));
            }
        });



    }
}
package com.example.docbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.docbook.R;
import com.example.docbook.adapters.TopDrListAdapter;
import com.example.docbook.databinding.ActivityMainBinding;
import com.example.docbook.models.DoctorInfoModel;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setSupportActionBar(binding.toolbarId);

        ArrayList<DoctorInfoModel> listData1 = new ArrayList<>();
        DoctorInfoModel topDoctorListData = new DoctorInfoModel("Dr. Tasnim Choia", "UAMC", "Mbbs from UAMC, FCPS , Heart specialist", "heart", R.raw.dr);
        for (int i = 0; i < 10; i++) listData1.add(topDoctorListData);
        binding.doctorListId.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.doctorListId.setAdapter(new TopDrListAdapter(listData1));

        binding.all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  startActivity(new Intent(MainActivity.this, DoctorListActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_bar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profileMenu:
                startActivity(new Intent(MainActivity.this, DoctorProfileActivity.class));
                break;
            case R.id.notificationMenu:

                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
package com.example.docbook;

import static java.util.Arrays.sort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.example.docbook.databinding.ActivityDoctorListBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DoctorListActivity extends AppCompatActivity {
private ActivityDoctorListBinding binding;
private DrListAdapter adapter;
private ArrayList<DoctorData> drList;
private String[] DistrictList={"All","Dhaka", "Faridpur" ,"Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj",
        "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail", "Bogura", "Joypurhat", "Naogaon",
        "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajgonj", "Dinajpur", "Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur",
        "Thakurgaon", "Barguna", "Barishal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban", "Brahmanbaria", "Chandpur", "Chattogram", "Cumilla",
       "Cox's Bazar", "Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati", "Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga", "Jashore", "Jhenaidah",
       "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDoctorListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.drListRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        DoctorData data=new DoctorData("Dr. Tasnim Choia","UAMC","FCPS","cardiologist",R.raw.dr);
        drList=new ArrayList<>();
        for(int i=0;i<=10;i++)
        {
            drList.add(data);
        }
        Arrays.sort(DistrictList);
        adapter=new DrListAdapter(drList);
        binding.drListRecycleView.setAdapter(adapter);
String[] sabit={"sa","dsa"};

        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.bd_districts,R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,DistrictList);

        binding.spinner.setAdapter(adapter);
        binding.spinner2.setAdapter(adapter1);

    }
}
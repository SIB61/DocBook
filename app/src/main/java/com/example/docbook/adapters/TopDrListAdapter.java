package com.example.docbook.adapters;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.docbook.R;
import com.example.docbook.activities.DoctorProfileActivity;
import com.example.docbook.models.DoctorInfoModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class TopDrListAdapter extends RecyclerView.Adapter {
    private ArrayList<DoctorInfoModel> listData;

    public TopDrListAdapter(ArrayList<DoctorInfoModel> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.top_dr_list_item, parent, false)) {};
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView textView = holder.itemView.findViewById(R.id.doctorNameId);
        TextView textView1= holder.itemView.findViewById(R.id.doctorDesId);
        CircleImageView imageView= holder.itemView.findViewById(R.id.topDrProfilePic);
        textView.setText(listData.get(position).getName());
        textView1.setText(listData.get(position).getAdditionalDegree());
        imageView.setImageResource(R.drawable.dr);




        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), DoctorProfileActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}


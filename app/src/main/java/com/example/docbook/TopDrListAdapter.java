package com.example.docbook;


import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopDrListAdapter extends RecyclerView.Adapter {
    private ArrayList<DoctorData> listData = new ArrayList<>();

    public TopDrListAdapter(ArrayList<DoctorData> listData) {
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
        ImageView imageView= holder.itemView.findViewById(R.id.doctorImgId);
        textView.setText(listData.get(position).getName());
        textView1.setText(listData.get(position).getAdditionalDegree());
        imageView.setImageResource(listData.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}


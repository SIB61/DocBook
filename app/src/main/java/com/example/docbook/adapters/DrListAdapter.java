package com.example.docbook.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.docbook.R;
import com.example.docbook.models.DoctorInfoModel;

import java.util.ArrayList;

public class DrListAdapter extends RecyclerView.Adapter {

    private ArrayList<DoctorInfoModel> drList ;

    public DrListAdapter(ArrayList<DoctorInfoModel> drList) {
        this.drList = drList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.dr_list_item,parent,false)) {};
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImageView drImage=holder.itemView.findViewById(R.id.image);
        TextView drName=holder.itemView.findViewById(R.id.name);
        TextView specialist=holder.itemView.findViewById(R.id.specialist);
        drImage.setImageResource(drList.get(position).getImg());
        drName.setText(drList.get(position).getName());
        specialist.setText(drList.get(position).getSpecialistOn());



    }

    @Override
    public int getItemCount() {
        return drList.size();
    }
}

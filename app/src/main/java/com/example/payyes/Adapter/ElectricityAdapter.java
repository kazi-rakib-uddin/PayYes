package com.example.payyes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.payyes.ElectricDetailsActivity;
import com.example.payyes.Model.DTH_Model;
import com.example.payyes.databinding.SingleDthBinding;

import java.util.List;

public class ElectricityAdapter extends RecyclerView.Adapter<ElectricityAdapter.Viewholder> {

    Context context;
    List<DTH_Model> dth_models;

    public ElectricityAdapter(Context context, List<DTH_Model> dth_models) {
        this.context = context;
        this.dth_models = dth_models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SingleDthBinding binding = SingleDthBinding.inflate(layoutInflater,parent,false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.binding.name.setText(dth_models.get(position).getName());
        holder.binding.image.setImageResource(dth_models.get(position).getImage());

        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, ElectricDetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dth_models.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        SingleDthBinding binding;
        public Viewholder(@NonNull SingleDthBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

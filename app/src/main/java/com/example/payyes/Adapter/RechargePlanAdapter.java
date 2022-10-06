package com.example.payyes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.payyes.RechargeActivity;
import com.example.payyes.databinding.SinglePrepaidBinding;


public class RechargePlanAdapter extends RecyclerView.Adapter<RechargePlanAdapter.Viewholder> {

    Context context;

    public RechargePlanAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SinglePrepaidBinding binding = SinglePrepaidBinding.inflate(layoutInflater,parent,false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        //new ReadMoreTextView(holder.binding.offer, 3, "Read More", "Read less","");

        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, RechargeActivity.class));

            }
        });
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        SinglePrepaidBinding binding;
        public Viewholder(@NonNull SinglePrepaidBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

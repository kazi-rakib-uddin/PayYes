package com.example.payyes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.payyes.DTHDetailsActivity;
import com.example.payyes.Model.DTH_Model;
import com.example.payyes.databinding.SingleDthBinding;
import com.example.payyes.databinding.SingleTransactionBinding;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.Viewholder> {

    Context context;
    List<DTH_Model> dth_models;

    public TransactionAdapter(Context context) {
        this.context = context;
       // this.dth_models = dth_models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SingleTransactionBinding binding = SingleTransactionBinding.inflate(layoutInflater,parent,false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        SingleTransactionBinding binding;
        public Viewholder(@NonNull SingleTransactionBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

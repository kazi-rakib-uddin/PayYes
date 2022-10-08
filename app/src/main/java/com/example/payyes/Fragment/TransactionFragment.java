package com.example.payyes.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.payyes.Adapter.TransactionAdapter;
import com.example.payyes.R;
import com.example.payyes.databinding.FragmentTransactionBinding;

public class TransactionFragment extends Fragment {

    FragmentTransactionBinding binding;
    TransactionAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        binding = FragmentTransactionBinding.inflate(layoutInflater,container,false);

        binding.rvTransaction.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));

        adapter = new TransactionAdapter(getContext());
        binding.rvTransaction.setAdapter(adapter);

        return binding.getRoot();
    }
}
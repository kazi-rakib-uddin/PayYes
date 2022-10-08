package com.example.payyes.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.payyes.AddMoneyActivity;
import com.example.payyes.AllRechargeActivity;
import com.example.payyes.DTHActivity;
import com.example.payyes.ElecticActivity;
import com.example.payyes.MobileRechargeActivity;
import com.example.payyes.R;
import com.example.payyes.SearchActivity;
import com.example.payyes.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false);

        binding.btnRecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), AllRechargeActivity.class));
            }
        });


        binding.btnMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), MobileRechargeActivity.class));
            }
        });

        binding.btnDth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), DTHActivity.class));
            }
        });

        binding.btnElectric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), ElecticActivity.class));
            }
        });

        binding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), SearchActivity.class));
            }
        });

        binding.btnAddMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), AddMoneyActivity.class));
            }
        });

        return binding.getRoot();
    }
}
package com.example.payyes.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.payyes.Adapter.RechargePlanAdapter;
import com.example.payyes.databinding.FragmentSpecialOfferBinding;


public class SpecialOfferFragment extends Fragment {

    FragmentSpecialOfferBinding binding;
    RechargePlanAdapter planAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        binding = FragmentSpecialOfferBinding.inflate(layoutInflater,container,false);
        planAdapter = new RechargePlanAdapter(getContext());
        binding.recSpecialOffer.setAdapter(planAdapter);
        return binding.getRoot();
    }
}
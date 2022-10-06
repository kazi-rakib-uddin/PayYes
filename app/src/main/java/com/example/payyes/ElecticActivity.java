package com.example.payyes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;

import com.example.payyes.Adapter.ElectricityAdapter;
import com.example.payyes.Model.DTH_Model;
import com.example.payyes.databinding.ActivityElecticBinding;

import java.util.ArrayList;
import java.util.List;

public class ElecticActivity extends AppCompatActivity {

    ActivityElecticBinding binding;
    List<DTH_Model> dth_models = new ArrayList<>();
    ElectricityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityElecticBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getPlan();

        binding.rvDth.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        adapter=new ElectricityAdapter(ElecticActivity.this,dth_models);
        binding.rvDth.setAdapter(adapter);
    }

    private List<DTH_Model> getPlan()
    {
        dth_models.add(new DTH_Model(R.drawable.cesc_logo,"CESC Limited"));
        dth_models.add(new DTH_Model(R.drawable.imdian_power_logo,"Indian Power"));
        dth_models.add(new DTH_Model(R.drawable.wb_logo,"West Bengal Electricity"));
        dth_models.add(new DTH_Model(R.drawable.adani_logo,"Adani Electricity Mumbai"));

        return dth_models;
    }
}
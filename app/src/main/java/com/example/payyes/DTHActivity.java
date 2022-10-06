package com.example.payyes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;

import com.example.payyes.Adapter.DTHAdapter;
import com.example.payyes.Model.DTH_Model;
import com.example.payyes.databinding.ActivityDthBinding;

import java.util.ArrayList;
import java.util.List;

public class DTHActivity extends AppCompatActivity {

    ActivityDthBinding binding;
    List<DTH_Model> dth_models = new ArrayList<>();
    DTHAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getPlan();

        binding.rvDth.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        adapter=new DTHAdapter(DTHActivity.this,dth_models);
        binding.rvDth.setAdapter(adapter);
    }

    private List<DTH_Model> getPlan()
    {
        dth_models.add(new DTH_Model(R.drawable.airtel_logo,"Airtel Digital TV"));
        dth_models.add(new DTH_Model(R.drawable.dish_tv_logo,"Dish TV"));
        dth_models.add(new DTH_Model(R.drawable.sun_direct_logo,"Sun Direct"));
        dth_models.add(new DTH_Model(R.drawable.d2h_logo,"D2H"));

        return dth_models;
    }
}
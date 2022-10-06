package com.example.payyes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.payyes.databinding.ActivityMobileRechargeBinding;

public class MobileRechargeActivity extends AppCompatActivity {

    ActivityMobileRechargeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMobileRechargeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       binding.btnNumber.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               startActivity(new Intent(MobileRechargeActivity.this,RechargePlanActivity.class));
           }
       });
    }
}
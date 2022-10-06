package com.example.payyes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.payyes.Fragment.SpecialOfferFragment;
import com.example.payyes.databinding.ActivityRechargePlanBinding;

import java.util.ArrayList;
import java.util.List;

public class RechargePlanActivity extends AppCompatActivity {

    ActivityRechargePlanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRechargePlanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupViewPager(binding.viewpager);
        binding.tabLayout.setupWithViewPager(binding.viewpager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Special Offer");

        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Topup");
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "DATA");
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Full TalkTime");
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Sms");
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Roaming");
        viewPagerAdapter.addFragment(new SpecialOfferFragment(), "Other");
        viewPager.setAdapter(viewPagerAdapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
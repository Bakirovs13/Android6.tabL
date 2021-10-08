package com.hfad.android6.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.hfad.android6.R;
import com.hfad.android6.databinding.ActivityMainBinding;
import com.hfad.android6.databinding.FragmentImageBinding;
import com.hfad.android6.ui.fragments.imageFragment.ImageFragment;
import com.hfad.android6.ui.fragments.numberFragment.NumberFragment;
import com.hfad.android6.ui.fragments.userFragment.UserFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list;
    private String[] titles  = {"Exchange","Data & Time","More"};
    private int[] tabIcons ={
            R.drawable.ic_list_numbered,
            R.drawable.ic_list_numbered,
            R.drawable.ic_list_numbered

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //init binding
        View view = binding.getRoot();
        setContentView(view);

        initViewPager();

    }

    private void initViewPager() {
        adapter = new ViewPagerAdapter(this);  //init adapter
        adapter.setList(getList());                           //send list
        binding.mainViewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.mainTabs, binding.mainViewPager, (tab, position) ->{
            tab.setText(titles[position]);
            tab.setIcon(tabIcons[position]);


        }).attach();

    }


    private ArrayList<Fragment> getList(){    //method to fill list
        list = new ArrayList<>();
        list.add(new UserFragment());
        list.add(new NumberFragment());
        list.add(new ImageFragment());


        return list;
    }
}
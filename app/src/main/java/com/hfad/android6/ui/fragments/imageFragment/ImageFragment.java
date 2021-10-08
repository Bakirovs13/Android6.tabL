package com.hfad.android6.ui.fragments.imageFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.hfad.android6.R;


public class ImageFragment extends Fragment {


    Switch swCheck;   ///поля
    ImageView imageView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_image,container,false);
        swCheck = (Switch) view.findViewById(R.id.switcher);        //init
        imageView = view.findViewById(R.id.switch_img);

        return view;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        swCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setImageResource(R.drawable.moon);
                }else{
                    imageView.setImageResource(R.drawable.day);
                }
                isChecked=!isChecked;
            }
        });
        super.onViewCreated(view, savedInstanceState);


    }
}
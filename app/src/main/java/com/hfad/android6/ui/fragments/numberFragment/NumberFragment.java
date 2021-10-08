package com.hfad.android6.ui.fragments.numberFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.android6.R;
import com.hfad.android6.databinding.FragmentNumberBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberFragment extends Fragment {

    private FragmentNumberBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNumberBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.dataTv.setText(
                new SimpleDateFormat("hh:mm dd/MM/yyyy")
                        .format(new Date(System.currentTimeMillis()))
        );
    }
}
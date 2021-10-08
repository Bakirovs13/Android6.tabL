package com.hfad.android6.ui.fragments.userFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.android6.R;
import com.hfad.android6.data.local.Data;
import com.hfad.android6.databinding.FragmentUserBinding;


public class UserFragment extends Fragment {
    private FragmentUserBinding binding;
    private UserAdapter adapter = new UserAdapter();
    private Data data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentUserBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
    }

    private void initRecycler() {
        data = new Data();
        adapter.setList(data.getList());
        binding.UserRv.setAdapter(adapter);
    }
}
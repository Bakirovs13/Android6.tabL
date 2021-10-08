package com.hfad.android6.data.local;

import com.hfad.android6.R;
import com.hfad.android6.models.User;

import java.util.ArrayList;

public class Data {

    private ArrayList<User> list;

    public ArrayList<User> getList() {
        list = new ArrayList<>();
        list.add(new User("V-coin", R.drawable.bitcoin,1));
        list.add(new User("B-coin+", R.drawable.bitcoin,400));
        list.add(new User("Label", R.drawable.bitcoin,000));
        list.add(new User("S-coin", R.drawable.bitcoin,600));
        list.add(new User("T-coin", R.drawable.bitcoin,4000));
        list.add(new User("X-coin", R.drawable.bitcoin,000));
        return list;
    }
}


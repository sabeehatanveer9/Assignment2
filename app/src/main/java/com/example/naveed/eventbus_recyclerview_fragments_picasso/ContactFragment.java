package com.example.naveed.eventbus_recyclerview_fragments_picasso;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ContactFragment extends Fragment{

    ArrayList<Data> contacts;
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recyclerview_layout, container, false);
        recyclerView= (RecyclerView) view.findViewById(R.id.recycler_view);
        contacts = Data.createContactsList(1000);
        customAdapter cAdapter = new customAdapter(getActivity(), contacts );
        recyclerView.setAdapter(cAdapter);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}

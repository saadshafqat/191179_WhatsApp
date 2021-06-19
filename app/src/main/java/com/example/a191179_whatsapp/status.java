package com.example.a191179_whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link status#newInstance} factory method to
 * create an instance of this fragment.
 */
public class status extends Fragment {
    RecyclerView recyclerView;
    StatusListAdapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public status() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment status.
     */
    // TODO: Rename and change types and number of parameters
    public static status newInstance(String param1, String param2) {
        status fragment = new status();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private List<StatusModelList> list=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_status, container, false);
        recyclerView= view.findViewById(R.id.rvstatus);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getstatuslist();
        return view;
    }

    private void getstatuslist() {
        list.add(new StatusModelList("Muhammad Saad Shafqat","https://scontent.flhe3-1.fna.fbcdn.net/v/t1.6435-9/201079243_2963524837230581_1449008856238563210_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=BgYdZgmxUPsAX9vrGB7&tn=pYQTYT0WAE35baQq&_nc_ht=scontent.flhe3-1.fna&oh=51fdee12e256d1107b8aa3a5126ad427&oe=60D29BC6"));
        list.add(new StatusModelList("Shafqat Iqbal","https://scontent.flhe3-1.fna.fbcdn.net/v/t1.6435-0/s640x640/131424565_2831180430465023_7582198029614219613_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=730e14&_nc_ohc=fnvn7xhxfQ4AX88b5Zd&_nc_ht=scontent.flhe3-1.fna&tp=7&oh=6b18a94598236a146b6b9e888e99b1f3&oe=60D3B165"));
        recyclerView.setAdapter(new StatusListAdapter(list,getContext()));

    }
}
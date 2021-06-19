package com.example.a191179_whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link chats#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chats extends Fragment {
    RecyclerView recyclerView;
    ChatListAdapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public chats() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment chats.
     */
    // TODO: Rename and change types and number of parameters
    public static chats newInstance(String param1, String param2) {
        chats fragment = new chats();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private List<ModelList> list=new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView= view.findViewById(R.id.rvchats);
recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getchatlist();
        return view;
    }

    private void getchatlist() {
        list.add(new ModelList("1","Muhammad Saad Shafqat","191179","6/19/2021","https://scontent.flhe3-1.fna.fbcdn.net/v/t1.6435-9/201079243_2963524837230581_1449008856238563210_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=BgYdZgmxUPsAX9vrGB7&tn=pYQTYT0WAE35baQq&_nc_ht=scontent.flhe3-1.fna&oh=51fdee12e256d1107b8aa3a5126ad427&oe=60D29BC6"));
        list.add(new ModelList("1","Ch Zain","Typing...","6/19/2021","https://scontent.flhe3-1.fna.fbcdn.net/v/t1.6435-1/p200x200/194375926_1148279279008766_3102389656306170620_n.jpg?_nc_cat=104&ccb=1-3&_nc_sid=7206a8&_nc_ohc=o3ImsiOCtFwAX8TXFH6&_nc_ht=scontent.flhe3-1.fna&tp=6&oh=07afcc380600e04620d3d62a493f78ba&oe=60D2B67A"));
        list.add(new ModelList("1","Shafqat Iqbal","Available","6/19/2021","https://scontent.flhe3-1.fna.fbcdn.net/v/t1.6435-0/s640x640/131424565_2831180430465023_7582198029614219613_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=730e14&_nc_ohc=fnvn7xhxfQ4AX88b5Zd&_nc_ht=scontent.flhe3-1.fna&tp=7&oh=6b18a94598236a146b6b9e888e99b1f3&oe=60D3B165"));
        recyclerView.setAdapter(new ChatListAdapter(list,getContext()));
    }
}
package com.example.a191179_whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class CallListAdapter extends RecyclerView.Adapter<CallListAdapter.ViewHolder> {
    private List<CallModelList> modelLists;
    private Context context;

    public CallListAdapter(List<CallModelList> modelLists, Context context) {
        this.modelLists = modelLists;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.calls_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CallModelList modelList = modelLists.get(position);

        holder.txt1.setText(modelList.getUserName());


        Glide.with(context).load(modelList.getProfilePhoto()).into(holder.img);




    }

    @Override
    public int getItemCount() {
        return modelLists.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt1;
        CircularImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=(TextView) itemView.findViewById(R.id.heading);
            img= itemView.findViewById(R.id.profilephoto);


        }
    }
}
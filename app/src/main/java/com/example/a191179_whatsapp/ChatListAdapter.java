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

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ViewHolder> {
private List<ModelList> modelLists;
    private Context context;

    public ChatListAdapter(List<ModelList> modelLists, Context context) {
        this.modelLists = modelLists;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.chats_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ModelList modelList = modelLists.get(position);

        holder.txt1.setText(modelList.getUserName());
        holder.txt2.setText(modelList.getDescription());
        holder.txt3.setText(modelList.getDate());

        Glide.with(context).load(modelList.getUrlProfile()).into(holder.img);




    }

    @Override
    public int getItemCount() {
        return modelLists.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt1,txt2,txt3;
        CircularImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=(TextView) itemView.findViewById(R.id.heading);
            txt2=(TextView) itemView.findViewById(R.id.description);
            txt3=(TextView) itemView.findViewById(R.id.date);
            img= itemView.findViewById(R.id.profilephoto);

        }
    }
}

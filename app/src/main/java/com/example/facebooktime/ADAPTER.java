package com.example.facebooktime;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public  class ADAPTER extends RecyclerView.Adapter<ADAPTER.postItemViewHolder> {
    List<DATACLASS> postInfo;

    public ADAPTER(List<DATACLASS> postInfo) {
        this.postInfo = postInfo;
    }

    @NonNull
    @Override
    public postItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        return new postItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull postItemViewHolder holder, int position) {
        DATACLASS item=postInfo.get(position);
        holder.time.setText(item.getTime());
        holder.name.setText(item.getName());
        holder.post.setText(item.getPost());
        holder.photo.setImageResource(item.getImg());




    }

    @Override
    public int getItemCount() {
        return postInfo.size();
    }

    class postItemViewHolder extends RecyclerView.ViewHolder{
        ImageView icon,photo;
        TextView name ,time,post;



        public postItemViewHolder(@NonNull View itemView) {
            super(itemView);


            photo=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
            post=itemView.findViewById(R.id.post);




        }
    }
}

package com.winfred.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {
    private List<Sports> sportList;

    public CustomAdapter(List<Sports> sportList) {
        this.sportList = sportList;
    }


    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout,parent,false);
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sports sport= sportList.get(position);
        holder.sportNameTV.setText(sport.getSportName());
        holder.sportImageView.setImageResource(sport.getSportImage());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        TextView sportNameTV;
        ImageView sportImageView;
        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            sportNameTV=itemView.findViewById(R.id.textviewcard);
            sportImageView=itemView.findViewById(R.id.imageviewcard);

        }
    }
}

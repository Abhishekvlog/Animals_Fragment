package com.example.animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private ImageView mTvAnimal;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAnimal = itemView.findViewById(R.id.ivAnimal);
    }
    public void setData(Animal animal){
        mTvName.setText(animal.getName());
        mTvAnimal.setImageResource(animal.getImageid());
    }
}

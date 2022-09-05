package com.example.countriesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countriesapp.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<String> continents;
    private OnItemClickListen OnItemClickListen;

    public ContinentAdapter(ArrayList<String> continents, OnItemClickListen onItemClickListen) {
        this.continents = continents;
        this.OnItemClickListen = onItemClickListen;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnItemClickListen.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }




    public class ContinentViewHolder extends RecyclerView.ViewHolder{
        private ItemContinentBinding binding;

        public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind (String name){
            binding.continentTv.setText(name);
        }
    }

    public interface OnItemClickListen {
        void onItemClick(int pos);
    }
}

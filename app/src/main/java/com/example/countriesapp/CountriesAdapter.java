package com.example.countriesapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.countriesapp.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {
    private ArrayList<CountryModel> countries;

    public CountriesAdapter(ArrayList<CountryModel> countries) {
        this.countries = countries;
    }


    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(ItemCountryBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }




    public class CountriesViewHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;

        public CountriesViewHolder(@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(CountryModel countryModel){
            binding.countryName.setText(countryModel.getName());
            binding.countryCapital.setText(countryModel.getCapital());
//            Glide.with(binding.countryFlag).load(countryModel.getFlag()).into(binding.countryFlag);
            binding.countryFlag.setImageResource(countryModel.getFlag());

        }
    }
}

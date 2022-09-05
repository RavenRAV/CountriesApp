package com.example.countriesapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.countriesapp.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements ContinentAdapter.OnItemClickListen {
    private FragmentContinentBinding binding;
    public static String KEY_FOR_BUNDLE = "new_Key";
    private ArrayList<String> continents;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continents, this);
        binding.continentRecycler.setAdapter(adapter);
    }

    private void loadData() {
        continents = new ArrayList<>();
        continents.add("Asia");
        continents.add("Europa");
        continents.add("Africa");
        continents.add("North America");
        continents.add("South America");
        continents.add("Oceania");

    }

    @Override
    public void onItemClick(int pos) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_FOR_BUNDLE, String.valueOf(pos));
        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countriesFragment).addToBackStack(null).commit();

    }
}
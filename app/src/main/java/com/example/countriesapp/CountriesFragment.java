package com.example.countriesapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.countriesapp.databinding.FragmentCountriesBinding;

import java.util.ArrayList;

public class CountriesFragment extends Fragment {
    private FragmentCountriesBinding binding;
    private ArrayList<CountryModel> countries;
    private CountriesAdapter countriesAdapter;
    String value;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(getArguments() != null){
            value = getArguments().getString(ContinentFragment.KEY_FOR_BUNDLE);
        }
        loadData(value);
        countriesAdapter = new CountriesAdapter(countries);
        binding.countriesRecycler.setAdapter(countriesAdapter);

    }

    private void loadData(String pos) {
        countries = new ArrayList<>();
        switch (Integer.parseInt(pos)){
            case (0):
                countries.add(new CountryModel("Kyrgyzstan", R.drawable.ic_kg , "Bishkek"));
                countries.add(new CountryModel("Kazakhstan", R.drawable.ic_kz_3x, "Almaty"));
                countries.add(new CountryModel("China", R.drawable.ic_cn, "Pekin"));
                countries.add(new CountryModel("Japan", R.drawable.ic_jp_3x, "Tokyo"));
                countries.add(new CountryModel("South Korea", R.drawable.ic_kr_3x, "Seoul"));
                break;
            case (1):
                countries.add(new CountryModel("Russia", R.drawable.ic_ru_3x , "Moscow"));
                countries.add(new CountryModel("UK", R.drawable.ic_gb_3x, "London"));
                countries.add(new CountryModel("Germany", R.drawable.ic_de_3x, "Berlin"));
                countries.add(new CountryModel("Italy", R.drawable.ic_it_3x, "Rome"));
                countries.add(new CountryModel("France", R.drawable.ic_fr_3x, "Paris"));
                break;
            case (2):
                countries.add(new CountryModel("Egypt", R.drawable.ic_eg_3x , "Cairo"));
                countries.add(new CountryModel("Morocco", R.drawable.ic_ma_3x, "Rabat"));
                countries.add(new CountryModel("Ethiopia", R.drawable.ic_et_3x, "Addis Ababa"));
                countries.add(new CountryModel("Kenya", R.drawable.ic_ke_3x, "Nairobi"));
                countries.add(new CountryModel("Uganda", R.drawable.ic_ug_3x, "Kampala"));
                break;
            case (3):
                countries.add(new CountryModel("Barbados", R.drawable.ic_bb_3x , "Bridgetown"));
                countries.add(new CountryModel("The Bahamas", R.drawable.ic_bs_3x, "Nassau"));
                countries.add(new CountryModel("Bermuda", R.drawable.ic_bm_3x, "Hamilton"));
                countries.add(new CountryModel("Canada", R.drawable.ic_ca_3x, "Ottawa"));
                countries.add(new CountryModel("Costa Rica", R.drawable.ic_cr_3x, "San Jose"));
                break;
            case (4):
                countries.add(new CountryModel("Argentina", R.drawable.ic_ar_3x , "Buenos Aires"));
                countries.add(new CountryModel("Brazil", R.drawable.ic_br_3x, "Brasilia"));
                countries.add(new CountryModel("Chile", R.drawable.ic_cl_3x, "Santiago"));
                countries.add(new CountryModel("Colombia", R.drawable.ic_co_3x, "Bogota"));
                countries.add(new CountryModel("Peru", R.drawable.ic_pe_3x, "Lima"));
                break;
            case (5):
                countries.add(new CountryModel("Australia", R.drawable.ic_au_3x , "Canberra"));
                countries.add(new CountryModel("Fiji", R.drawable.ic_fj_3x, "Suva"));
                countries.add(new CountryModel("Palau", R.drawable.ic_cl_3x, "Ngerulmud"));
                countries.add(new CountryModel("Papua New Guinea", R.drawable.ic_pw_3x, "Port Moresby"));
                countries.add(new CountryModel("Tonga", R.drawable.ic_to_3x, "Nukuʻalofa"));
                break;
            default:
                countries.add(new CountryModel(pos, R.drawable.ic_jp_3x, pos));
                break;

        }

    }
}
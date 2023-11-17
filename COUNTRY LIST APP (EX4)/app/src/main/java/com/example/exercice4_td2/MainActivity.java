package com.example.exercice4_td2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_countries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Country> countries = getCountryList(); // Fetch your list of countries here
        CountryAdapter adapter = new CountryAdapter((Context) countries, (List<Country>) this);
        recyclerView.setAdapter(adapter);
    }

    private List<Country> getCountryList() {
        // Implement logic to fetch/populate the list of countries
        // Example: return a hardcoded list for demonstration purposes
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Tunisia", R.drawable.tunisia));
        countries.add(new Country("Palestine", R.drawable.palestine));
        countries.add(new Country("Ireland", R.drawable.irland));
        countries.add(new Country("Spain", R.drawable.spain));
        // Add more countries as needed
        return countries;
    }
}

package com.example.exercice3td2;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    private List<Person> personList;

    public PersonAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Implement methods for RecyclerView.Adapter: onCreateViewHolder, onBindViewHolder, getItemCount

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        // ViewHolder components for list_item.xml
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize views here
        }
    }
}


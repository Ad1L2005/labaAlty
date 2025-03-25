package com.example.labaalty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CountryAdap extends RecyclerView.Adapter<CountryAdap.ViewHolder> {
    private final List<Countries> countryList;
    private final Context context;

    public CountryAdap(Context context, List<Countries> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemcountry, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Countries country = countryList.get(position);
        holder.textViewCountry.setText(country.getName());
        holder.textViewPopulation.setText("Population: " + country.getPopulation());
        holder.imageViewFlag.setImageResource(country.getFlagResId());

        // Обработка нажатия на элемент
        holder.itemView.setOnClickListener(v -> {
            String message = "Selected: " + country.getName() + " (Population: " + country.getPopulation() + ")";
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCountry, textViewPopulation;
        ImageView imageViewFlag;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewCountry = itemView.findViewById(R.id.textViewCountry);
            textViewPopulation = itemView.findViewById(R.id.textViewPopulation);
            imageViewFlag = itemView.findViewById(R.id.imageViewFlag);
        }
    }
}

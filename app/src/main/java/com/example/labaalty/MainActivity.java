package com.example.labaalty;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Countries> countryList = new ArrayList<>();
        countryList.add(new Countries("Vietnam", "98,000,000", R.drawable.flag_of_vietnam));
        countryList.add(new Countries("United States", "320,000,000", R.drawable.flag_of_the_united_states));
        countryList.add(new Countries("Russia", "142,000,000", R.drawable.flag_of_russia));

        CountryAdap CountryAdap = new CountryAdap(countryList);

        recyclerView.setAdapter(CountryAdap);
    }
}

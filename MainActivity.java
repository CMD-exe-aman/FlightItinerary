// MainActivity.java
package com.example.flightitinerary;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Flight> flights = new ArrayList<>();
        // Add sample flight data
        flights.add(new Flight("FL123", "New York", "Los Angeles", "6h 30m"));
        flights.add(new Flight("FL456", "Chicago", "Miami", "3h 15m"));
        flights.add(new Flight("FL789", "Houston", "Phoenix", "2h 45m"));
        
        FlightAdapter adapter = new FlightAdapter(flights, this);
        recyclerView.setAdapter(adapter);
    }
}

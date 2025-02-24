// FlightDetailActivity.java
package com.example.flightitinerary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FlightDetailActivity extends AppCompatActivity {

    public static void start(Context context, Flight flight) {
        Intent intent = new Intent(context, FlightDetailActivity.class);
        intent.putExtra("Flight", flight);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_detail);

        Flight flight = (Flight) getIntent().getSerializableExtra("Flight");

        TextView flightDetails = findViewById(R.id.flight_details);
        if (flight != null) {
            flightDetails.setText(
                    "Flight Number: " + flight.getFlightNumber() +
                    "\nDeparture: " + flight.getDeparture() +
                    "\nArrival: " + flight.getArrival() +
                    "\nDuration: " + flight.getDuration()
            );
        }
    }
}

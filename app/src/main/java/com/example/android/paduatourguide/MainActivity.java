package com.example.android.paduatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Displays a welcome page with main info about the city,
 * a button that leads to the TourActivity
 * and a button to Padua in google map (using an explicit intent).
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find button_start Button
        Button button_start = (Button) findViewById(R.id.button_start);

        // Set click listeners on button_start Button
        button_start.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MyMusicActivity}
                Intent startIntent = new Intent(MainActivity.this, TourActivity.class);

                // Start the new activity
                startActivity(startIntent);
            }
        });

        // Find the map icon ImageView
        ImageView map_icon = (ImageView) findViewById(R.id.map_icon);

        // Set click listeners on map_icon ImageView
        map_icon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("geo:45.4064, 11.8768");

                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

                // Verify if the app is available to receive the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
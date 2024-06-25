package com.example.catalogue;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView calendarGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarGrid = findViewById(R.id.calendarGrid);
        // Setup adapter to load photos into the GridView
    }
}

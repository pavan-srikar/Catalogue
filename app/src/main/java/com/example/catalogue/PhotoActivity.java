package com.example.catalogue;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class PhotoActivity extends AppCompatActivity {
    private ImageView photoPreview;
    private EditText captionEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        photoPreview = findViewById(R.id.photoPreview);
        captionEditText = findViewById(R.id.captionEditText);
        saveButton = findViewById(R.id.saveButton);

        // Capture photo using camera and display in photoPreview

        saveButton.setOnClickListener(v -> {
            // Save photo and caption to storage
        });
    }
}

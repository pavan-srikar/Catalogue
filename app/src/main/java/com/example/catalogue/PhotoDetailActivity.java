package com.example.catalogue;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoDetailActivity extends AppCompatActivity {
    private ImageView photoDetail;
    private TextView captionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);

        photoDetail = findViewById(R.id.photoDetail);
        captionText = findViewById(R.id.captionText);

        // Load photo and caption from storage
    }
}

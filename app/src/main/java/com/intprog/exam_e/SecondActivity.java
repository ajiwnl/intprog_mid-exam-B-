package com.intprog.exam_e;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView displayId = findViewById(R.id.studentid);
        TextView displayName = findViewById(R.id.studentname);
        TextView displayPhone = findViewById(R.id.studentphone);
        ImageView displayPhoto = findViewById(R.id.studentpic);

        String id = getIntent().getStringExtra("Name");
        String name = getIntent().getStringExtra("ID");
        String phone = getIntent().getStringExtra("Phone");

        Bundle extras = getIntent().getExtras();
        Bitmap bmp = extras.getParcelable("imagebitmap");

        displayPhoto.setImageBitmap(bmp);

        displayId.setText(id);
        displayName.setText(name);
        displayPhone.setText(phone);
    }
}

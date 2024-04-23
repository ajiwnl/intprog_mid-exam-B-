package com.intprog.exam_e;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout first_selection = findViewById(R.id.first_entry);
        LinearLayout second_selection = findViewById(R.id.second_entry);
        LinearLayout third_selection = findViewById(R.id.third_entry);
        LinearLayout fourth_selection = findViewById(R.id.fourth_entry);

        first_selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView first_pic = findViewById(R.id.first_entry_pic);
                TextView first_id = findViewById(R.id.first_entry_num);
                TextView first_name = findViewById(R.id.first_entry_name);
                TextView first_phone = findViewById(R.id.first_entry_phone);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", first_name.getText().toString());
                intent.putExtra("ID", first_id.getText().toString());
                intent.putExtra("Phone", first_phone.getText().toString());

                first_pic.setDrawingCacheEnabled(true);
                Bitmap image = first_pic.getDrawingCache();

                Bundle extras = new Bundle();
                extras.putParcelable("imagebitmap", image);
                intent.putExtras(extras);

                startActivity(intent);
            }
        });
    }
}
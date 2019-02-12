package com.example.maliuping.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        TextView text = findViewById(R.id.normal_tran);
        //text.setText(data);

    }
}

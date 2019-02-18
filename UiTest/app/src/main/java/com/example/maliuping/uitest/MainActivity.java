package com.example.maliuping.uitest;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        private EditText editText;
        private ImageView imageView;
        private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonEdit = (Button)findViewById(R.id.button);

        editText = (EditText)findViewById(R.id.edit_text);

        imageView = (ImageView)findViewById(R.id.image_view);

        progressBar = findViewById(R.id.progress_bar);

        buttonEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button:
                //String inpuText = editText.getText().toString();
                //Toast.makeText(MainActivity.this, inpuText, Toast.LENGTH_SHORT).show();
                //imageView.setImageResource(R.drawable.img_2);
                /*if(progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }*/
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                break;

            default:

                break;
        }

    }
}


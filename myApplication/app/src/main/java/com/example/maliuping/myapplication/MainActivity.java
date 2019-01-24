package com.example.maliuping.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ActivityA:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.out.println("A:onCreate");
        Log.d(TAG,"A:onCreate");
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnStartAnother).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnotherActivity.class));
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"A:onStart");
        //System.out.println("A:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"A:onResume");
        //System.out.println("A:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"A:onPause");
        //System.out.println("A:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"A:onStop");
        //System.out.println("A:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"A:onRestart");
        //System.out.println("A:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"A:onDestroy");
        //System.out.println("A:onDestroy");
    }
}

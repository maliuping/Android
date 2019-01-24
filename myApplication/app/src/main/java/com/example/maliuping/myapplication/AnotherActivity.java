package com.example.maliuping.myapplication;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends AppCompatActivity {

    public static final String TAG = "ActivityB:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"B:onCreate");
        //System.out.println("B:onCreate");
        setContentView(R.layout.activity_another);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"B:onStart");
        //System.out.println("A:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"B:onResume");
        //System.out.println("A:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"B:onPause");
        //System.out.println("A:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"B:onStop");
        //System.out.println("A:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"B:onRestart");
        //System.out.println("A:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "B:onDestroy");
        //System.out.println("A:onDestroy");
    }
}

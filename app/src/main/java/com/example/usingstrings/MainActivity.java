package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt2);
        txt.setText(R.string.Msg2);

        Log.i(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: ");
    }
}
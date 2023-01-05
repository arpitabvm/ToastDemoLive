package com.example.toastdemolive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastlib.Toast1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast1.toast_show(this, "aaaaa");
    }
}
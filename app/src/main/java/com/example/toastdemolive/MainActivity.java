package com.example.toastdemolive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastlib.Toast2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast2.toast_show(this, "aaaaa");
    }
}
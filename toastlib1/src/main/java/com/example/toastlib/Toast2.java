package com.example.toastlib;

import static android.widget.Toast.LENGTH_SHORT;

import android.app.Activity;

public class Toast2 {

    public static void toast_show(Activity activity, String name) {
        android.widget.Toast.makeText(activity, "" + name, LENGTH_SHORT).show();
    }

    public static void toast_show1(Activity activity, String name) {
        android.widget.Toast.makeText(activity, "" + name, LENGTH_SHORT).show();
    }
}

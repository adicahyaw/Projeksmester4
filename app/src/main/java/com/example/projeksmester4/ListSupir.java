package com.example.projeksmester4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ListSupir extends AppCompatActivity {

    public static final String ROOT_URL = "http://192.168.1.6/API/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_supir);
    }
}

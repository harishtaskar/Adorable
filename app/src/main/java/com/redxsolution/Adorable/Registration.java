package com.redxsolution.Adorable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
}
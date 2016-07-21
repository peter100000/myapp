package com.ljj.mobile.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class manage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage);
    }

    public void btn (View v){
        Intent intent = new Intent(manage.this, sinchung.class);
        startActivity(intent);
    }
}
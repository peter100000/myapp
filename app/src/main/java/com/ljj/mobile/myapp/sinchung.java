package com.ljj.mobile.myapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;


public class sinchung extends AppCompatActivity {


    public void btn2 (View v){
        Intent intent = new Intent(sinchung.this, manage.class);
        startActivity(intent);
    }



}

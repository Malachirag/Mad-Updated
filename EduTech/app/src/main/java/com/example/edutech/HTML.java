package com.example.edutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HTML extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(HTML.this, Videos.class);
        startActivity(intent);
        finish();
    }
}
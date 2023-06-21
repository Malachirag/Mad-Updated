package com.example.edutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class css extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
    }
    public void onBackPressed() {
        Intent intent = new Intent(css.this, Videos.class);
        startActivity(intent);
        finish();
    }
}
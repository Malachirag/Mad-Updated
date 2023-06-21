package com.example.edutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Videos extends AppCompatActivity
{
  Button html,css;
  String videouri;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        html=findViewById(R.id.html);
        css=findViewById(R.id.css);

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Videos.this,HTML.class);
                startActivity(i);
                finish();
            }
        });
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(Videos.this, css.class);
                startActivity(i);
                finish();


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Videos.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
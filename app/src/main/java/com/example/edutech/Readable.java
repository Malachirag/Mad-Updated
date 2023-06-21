package com.example.edutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Readable extends AppCompatActivity
{
    Button cloud,oper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readable);

        cloud=findViewById(R.id.cloud);
        oper=findViewById(R.id.oper);

        cloud.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(Readable.this,Firebase.class);
                startActivity(i);
                finish();
            }
        });
        oper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(Readable.this, Firebase.class);
                startActivity(i);
                finish();


            }
        });


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Readable.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
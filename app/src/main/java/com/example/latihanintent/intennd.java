package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intennd extends AppCompatActivity implements View.OnClickListener {
    Button butoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent4);
        butoon = findViewById(R.id.butoon);
        butoon.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent halaman4 = new Intent(intennd.this, intenne.class);
        startActivity(halaman4);
    }
}

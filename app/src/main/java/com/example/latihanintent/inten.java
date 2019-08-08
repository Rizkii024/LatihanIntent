package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class inten extends AppCompatActivity implements View.OnClickListener {
    Button daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);
        daftar = findViewById(R.id.Daftar);
        daftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent halaman2 = new Intent(inten.this, intenna.class);
        startActivity(halaman2);
    }
}

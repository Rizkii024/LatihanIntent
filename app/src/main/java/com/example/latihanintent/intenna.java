package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intenna extends AppCompatActivity implements View.OnClickListener {
    Button btnLihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent1);
        btnLihat = findViewById(R.id.btnLihat);
        btnLihat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent halaman3 = new Intent(intenna.this, intennb.class);
        startActivity(halaman3);
    }
}


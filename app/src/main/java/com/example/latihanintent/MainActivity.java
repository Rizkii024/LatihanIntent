package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button login;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.tombol_login);
        login.setOnClickListener(this);
        register = findViewById(R.id.tombol_guest);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tombol_login:
                Intent explicit = new Intent(MainActivity.this, intennc.class);
                startActivity(explicit);
                break;
            case R.id.tombol_guest:
                Intent implicit = new Intent(MainActivity.this, inten.class);
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}

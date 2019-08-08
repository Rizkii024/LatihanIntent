package com.example.latihanintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intennc extends AppCompatActivity implements View.OnClickListener {
    Button Ok;
    Button Batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent3);
        Ok = findViewById(R.id.Ok);
        Ok.setOnClickListener(this);
        Batal = findViewById(R.id.Batal);
        Batal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Batal:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Rizkii024"));
                startActivity(implicit);
                break;
            case R.id.Ok:
                Intent explicit = new Intent(intennc.this, intenne.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}

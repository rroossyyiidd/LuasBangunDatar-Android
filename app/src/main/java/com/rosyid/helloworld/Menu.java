package com.rosyid.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button btnPersegi;
    private Button btnPersegiPanjang;
    private Button btnSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnLingkaran = (Button) findViewById(R.id.buttonLingkaran);
        btnPersegi = (Button) findViewById(R.id.buttonPersegi);
        btnPersegiPanjang = (Button) findViewById(R.id.buttonPersegiPanjang);
        btnSegitiga = (Button) findViewById(R.id.buttonSegitiga);

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lingkaran.class);
                startActivity(i);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Persegi.class);
                startActivity(i);
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PersegiPanjang.class);
                startActivity(i);
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Segitiga.class);
                startActivity(i);
            }
        });
    }
}

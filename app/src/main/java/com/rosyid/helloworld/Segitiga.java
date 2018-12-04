package com.rosyid.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    private EditText alas, tinggi;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        Button hitung = (Button) findViewById(R.id.btn_hitung_luas_segitiga);
        alas = (EditText) findViewById(R.id.alassegitiga);
        tinggi = (EditText) findViewById(R.id.tinggisegitiga);
        hasil = (TextView) findViewById(R.id.text_luas_segitiga);

        alas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hasil.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tinggi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hasil.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valAlas = alas.getText().toString().trim();
                String valTinggi = tinggi.getText().toString().trim();

                if (valAlas.length() == 0 || valTinggi.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Alas dan Tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Double.parseDouble(valAlas);
                    double t = Double.parseDouble(valTinggi);
                    double valHasil = (a * t) / 2;

                    hasil.setText("Luas: " + valHasil);
                }
            }
        });
    }
}

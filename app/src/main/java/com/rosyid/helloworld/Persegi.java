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

public class Persegi extends AppCompatActivity {

    private EditText lebarPersegi, panjangPersegi;
    private TextView luasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        lebarPersegi = (EditText) findViewById(R.id.lebarpersegi);
        panjangPersegi = (EditText) findViewById(R.id.panjangpersegi);
        luasPersegi = (TextView) findViewById(R.id.text_luas_persegi);
        Button hitung = (Button) findViewById(R.id.btn_hitung_luas_persegi);

        lebarPersegi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                luasPersegi.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        panjangPersegi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                luasPersegi.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lebar = lebarPersegi.getText().toString().trim();
                String panjang = panjangPersegi.getText().toString().trim();

                if (panjang.length() == 0 || lebar.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Panjang dan lebar tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double luas = p * l;

                    luasPersegi.setText("Luas: " + luas);
                }

            }
        });

    }
}

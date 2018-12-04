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

public class PersegiPanjang extends AppCompatActivity {

    private EditText textPanjang, textLebar;
    private TextView textLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        textPanjang = (EditText) findViewById(R.id.panjangpersegipanjang);
        textLebar = (EditText) findViewById(R.id.lebarpersegipanjang);
        Button btnHitungLuas = (Button) findViewById(R.id.btn_hitung_luas_persegi_panjang);
        textLuas = (TextView) findViewById(R.id.text_luas_persegi_panjang);

        textPanjang.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textLuas.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        textLebar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textLuas.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = textPanjang.getText().toString().trim();
                String lebar = textLebar.getText().toString().trim();

                if (panjang.length() == 0 || lebar.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Panjang dan lebar tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double luas = p * l;

                    textLuas.setText("Luas: " + luas);
                }
            }
        });

    }


}

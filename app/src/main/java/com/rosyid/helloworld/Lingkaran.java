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

public class Lingkaran extends AppCompatActivity {

    private EditText jarijari;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        Button hitung = (Button) findViewById(R.id.btn_hitung_luas_lingkaran);
        jarijari = (EditText) findViewById(R.id.jarijari);
        hasil = (TextView) findViewById(R.id.text_luas_lingkaran);

        jarijari.addTextChangedListener(new TextWatcher() {
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
                String jari2 = jarijari.getText().toString().trim();

                if (jari2.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Jari jari tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double r = Double.parseDouble(jari2);
                    double hasilHitung = 3.14 * r * r;

                    hasil.setText("Luas: " + hasilHitung);
                }
            }
        });

    }
}

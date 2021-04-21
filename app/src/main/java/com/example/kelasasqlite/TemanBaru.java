package com.example.kelasasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class TemanBaru extends AppCompatActivity {
    private TextInputEditText tNama,tTelpon;
    private Button simpanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman_baru);

        tNama = (TextInputEditText)findViewById(R.id.tietNama);
        tTelpon = (TextInputEditText)findViewById(R.id.tietTelpon);
        simpanBtn = (Button)findViewById(R.id.buttonSave);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tNama.getText().toString().equals("")||tTelpon.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Data belum komplit !",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
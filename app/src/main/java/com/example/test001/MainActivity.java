package com.example.test001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName, etHint;
    TextView tvName;
    ImageButton btnDrizzy;
    Button btnTC;
    Button btnNWTS;
    Button btnIYRTITL;
    Button btnMeek;
    Button btnWATTBA;
    Button btnPush;
    Button btnScorpion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etHint = findViewById(R.id.etHint);
        tvName = findViewById(R.id.tvName);
        btnDrizzy = findViewById(R.id.btnDrizzy);
        btnTC = findViewById(R.id.btnTC);
        btnNWTS = findViewById(R.id.btnNWTS);
        btnIYRTITL = findViewById(R.id.btnIYRTITL);
        btnMeek = findViewById(R.id.btnMeek);
        btnWATTBA = findViewById(R.id.btnWATTBA);
        btnPush = findViewById(R.id.btnPush);
        btnScorpion = findViewById(R.id.btnScorpion);

        btnDrizzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,
                        com.example.test001.Activity2.class);
                startActivity(intent);

            }

        });



    }
}


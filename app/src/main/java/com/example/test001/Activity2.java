package com.example.test001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity implements ListFrag.ItemSelected {

    Button btnTC;
    Button btnNWTS;
    Button btnIYRTITL;
    Button btnMeek;
    Button btnWATTBA;
    Button btnPush;
    Button btnScorpion;

    TextView tvDescription;
    ArrayList<String> descriptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnTC = findViewById(R.id.btnTC);
        btnNWTS = findViewById(R.id.btnNWTS);
        btnIYRTITL = findViewById(R.id.btnIYRTITL);
        btnMeek = findViewById(R.id.btnMeek);
        btnWATTBA = findViewById(R.id.btnWATTBA);
        btnPush = findViewById(R.id.btnPush);
        btnScorpion = findViewById(R.id.btnScorpion);

        btnTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.test001.Take_Care.class);
                startActivity(intent);
            }
        });
        btnNWTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.test001.Nothing_Was_The_Same.class);
                startActivity(intent);
            }
        });
        btnIYRTITL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.test001.If_Youre_Reading_This_Its_Too_Late.class);
                startActivity(intent);
            }
        });
        btnMeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.test001.Meek_Mill.class);
                startActivity(intent);
            }
        });

        tvDescription = findViewById(R.id.tvDescription);


        descriptions = new ArrayList<String>();

        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("Descriptions for item 1");
        descriptions.add("descriptions for Item 1");
    }

    @Override
    public void onItemSelected(int index) {

        tvDescription.setText(descriptions.get(index));

    }
}
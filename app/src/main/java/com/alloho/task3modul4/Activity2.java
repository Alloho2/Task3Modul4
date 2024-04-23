package com.alloho.task3modul4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView allPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        allPrice = findViewById(R.id.allPrice);
        Bundle bundleIntent = getIntent().getExtras();
        String result = bundleIntent.getString("calcPrice" );
        allPrice.setText("Итоговая цена = " + result);

    }
}
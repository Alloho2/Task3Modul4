package com.alloho.task3modul4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText priceMotor;
    private EditText priceTransmission;
    private EditText priceBody;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceMotor = findViewById(R.id.priceMotor);
        priceTransmission = findViewById(R.id.priceTransmission);
        priceBody= findViewById(R.id.priceBody);
        button = findViewById(R.id.callculate);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Activity2.class);
            float allPrice = Float.parseFloat(priceBody.getText().toString())+Float.parseFloat(priceTransmission.getText().toString())+Float.parseFloat(priceMotor.getText().toString());
            String string = String.valueOf(allPrice);
            intent.putExtra("calcPrice",string);
            startActivity(intent);
        });
    }
}
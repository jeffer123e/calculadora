package com.demh.calculadora_ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mostrador;
    double n1,n2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bcero(View view)
    {
        mostrador =(TextView) findViewById(R.id.mostrador);
        mostrador.setText.(mostrador.getText() "0");

    }
}
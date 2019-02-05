package com.example.anton.httprequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();

        Button boton = findViewById(R.id.button);


        //Al hacer click cambiamos al layout de Pregunta.
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Pregunta.class);
                startActivity(i);
            }
        });
    }
}
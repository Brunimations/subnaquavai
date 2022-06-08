package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cronstrucoes extends AppCompatActivity {

    Button botaovoltar;
    Button botaoyoutube1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronstrucoes);
        botaovoltar=(Button) findViewById(R.id.voltar);
        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamain();
            }
        });
        botaoyoutube1=(Button) findViewById(R.id.maisconstroi);
        botaoyoutube1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparayoutube1();
            }
        });
    }
    void irparamain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    void irparayoutube1(){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TCXUVOB6lz8"));
            startActivity(intent);
}}
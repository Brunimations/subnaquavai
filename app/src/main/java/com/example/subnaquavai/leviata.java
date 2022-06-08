package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class leviata extends AppCompatActivity {

    Button botaovoltar5;
    Button botaoyoutube4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leviata);
        botaovoltar5=(Button) findViewById(R.id.voltar5);
        botaovoltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamain5();
            }
        });
        botaoyoutube4=(Button) findViewById(R.id.maisconstroi4);
        botaoyoutube4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparayoutube4();
            }
        });
    }
    void irparamain5(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void irparayoutube4(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EWB72B0goOI"));
        startActivity(intent);
}}
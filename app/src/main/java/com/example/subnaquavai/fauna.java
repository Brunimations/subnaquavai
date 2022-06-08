package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fauna extends AppCompatActivity {

    Button botaovoltar4;
    Button botaoyoutube2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna);
        botaovoltar4=(Button) findViewById(R.id.voltar4);
        botaovoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamain4();
            }
        });
        botaoyoutube2=(Button) findViewById(R.id.maisconstroi2);
        botaoyoutube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparayoutube2();
            }
        });
    }
    void irparamain4(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void irparayoutube2(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TCXUVOB6lz8"));
        startActivity(intent);
}}
package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flora extends AppCompatActivity {

    Button botaovoltar3;
    Button botaoyoutube3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora);
        botaovoltar3=(Button) findViewById(R.id.voltar3);
        botaovoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamain3();
            }
        });
        botaoyoutube3=(Button) findViewById(R.id.maisconstroi3);
        botaoyoutube3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparayoutube3();
            }
        });
    }
    void irparamain3(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void irparayoutube3(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=a-io9SdVTMw"));
        startActivity(intent);
}}
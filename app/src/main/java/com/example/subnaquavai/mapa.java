package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapa extends AppCompatActivity {

    Button botaovoltar2;
    Button botaoyoutube5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        botaovoltar2=(Button) findViewById(R.id.voltar2);
        botaovoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamain2();
            }
        });
        botaoyoutube5=(Button) findViewById(R.id.maisconstroi5);
        botaoyoutube5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparayoutube5();
            }
        });
    }
    void irparamain2(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void irparayoutube5(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=REdjmkyU3n8"));
        startActivity(intent);
}}
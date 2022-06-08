package com.example.subnaquavai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoconstrucao;
    Button botaomapa;
    Button botaofauna;
    Button botaoflora;
    Button botaoleviata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoconstrucao=(Button) findViewById(R.id.construtiveis2);
        botaoconstrucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparaconstrucoes();
            }
        });
        botaomapa=(Button) findViewById(R.id.construtiveis3);
        botaomapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparamapa();
            }
        });
        botaofauna=(Button) findViewById(R.id.construtiveis4);
        botaofauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparafauna();
            }
        });
        botaoflora=(Button) findViewById(R.id.construtiveis5);
        botaoflora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparaflora();
            }
        });
        botaoleviata=(Button) findViewById(R.id.construtiveis6);
        botaoleviata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irparaleviata();
            }
        });
    }
    void irparaconstrucoes(){
        Intent intent = new Intent(this,cronstrucoes.class);
        startActivity(intent);
    }
    void irparamapa(){
        Intent intent = new Intent(this,mapa.class);
        startActivity(intent);
    }
    void irparafauna(){
        Intent intent = new Intent(this,fauna.class);
        startActivity(intent);
    }
    void irparaflora(){
        Intent intent = new Intent(this,flora.class);
        startActivity(intent);
    }
    void irparaleviata(){
        Intent intent = new Intent(this,leviata.class);
        startActivity(intent);
    }
}
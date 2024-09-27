package com.example.appdeabdielyf;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySobreMi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btnSiguente2 = findViewById(R.id.btnSiguente2);
        Button btnDialogo = findViewById(R.id.btnDialogo);
        Button btnDialogo2 = findViewById(R.id.btnDialogo2);


        btnDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivitySobreMi.this);
                builder.setTitle("Sobre mi");
                builder.setMessage("Me llamo Abdiel soy de chillan me gusta mucho tocar la bateria y tambien el basket, me gusta programar haci refortalesco mis conocimiento y me gusta mucho la musica sobre todo si estro genero que no conosco");


                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        btnDialogo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivitySobreMi.this);
                builder.setTitle("Futuros logros");
                builder.setMessage("Me gustaria sacar mi carrrera para ser mejor persona y porder expresar por que logre sacar mi carrera y explicar lo bonito que es la ingenieria en informatica para que las de mas personas tambien puedan a dedicarse a esto ya es el futuro del universo por que siempre nos vamos actualizando en el mundo, siempre sale algo nuevo cada dia.");


                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        btnSiguente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_redes_sociales);
            }
        });


    }
}
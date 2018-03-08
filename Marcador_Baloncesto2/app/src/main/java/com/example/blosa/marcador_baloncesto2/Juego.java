package com.example.blosa.marcador_baloncesto2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Juego extends AppCompatActivity{
    private TextView mar_local,mar_visitante,localNombre,visitanteNombre;
    private String deQuien, local,visitante;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mar_local= (TextView) findViewById(R.id.puntuacionlocal);
        mar_visitante= (TextView) findViewById(R.id.puntuacionvisitante);


        /* COGEMOS EL TEXTVIEW DONDE INSERTAR EL TEXTO */
        localNombre = findViewById(R.id.textView);
        visitanteNombre = findViewById(R.id.textView2);
        /*CREAMOS EL ENLACE*/
        Intent intent=getIntent();
        /*COGEMOS LA VARIABLE QUE QUEREMOS GUARDAR EN EL NUEVO ACTIVITY*/
        local = intent.getStringExtra(MainActivity.MENSAJE_MANDADO);
        visitante = intent.getStringExtra(MainActivity.MENSAJE_MANDADO2);
        localNombre.setText(local);
        visitanteNombre.setText(visitante);

    }
    public void localLibre(View view){
        deQuien="localLibre";
        mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())+1)));
    }

    public void localDoble(View view){
        deQuien="localDoble";
        mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())+2)));
    }

    public void localTriple(View view){
        deQuien="localTriple";
        mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())+3)));
    }

    public void visitanteLibre(View view){
        deQuien="visitanteLibre";
        mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString())+1)));
    }

    public void visitanteDoble(View view) {
        deQuien = "visitanteDoble";
        mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString()) + 2)));
    }
    public void visitanteTriple(View view){
        deQuien="visitanteTriple";
        mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString())+3)));
    }

    public void borrarUltimaJugada(View view){
        switch (deQuien){
            case "localLibre":
                mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())-1)));
                deQuien="";
                break;
            case "localDoble":
                mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())-2)));
                deQuien="";
                break;
            case "localTriple":
                mar_local.setText(Integer.toString((Integer.parseInt(mar_local.getText().toString())-3)));
                deQuien="";
                break;
            case "visitanteLibre":
                mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString())-1)));
                deQuien="";
                break;
            case "visitanteDoble":
                mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString())-2)));
                deQuien="";
                break;
            case "visitanteTriple":
                mar_visitante.setText(Integer.toString((Integer.parseInt(mar_visitante.getText().toString())-3)));
                deQuien="";
                break;
            default:
                Toast.makeText(getApplicationContext(),"No hay jugada anterior", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
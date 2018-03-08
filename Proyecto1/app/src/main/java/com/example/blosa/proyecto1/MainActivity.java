package com.example.blosa.proyecto1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mar_local,mar_visitante;
    private String deQuien;
    private int local,visitante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mar_local= (TextView) findViewById(R.id.puntuacionlocal);
        mar_visitante= (TextView) findViewById(R.id.puntuacionvisitante);
        restaurarEstado(savedInstanceState);
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

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState( savedInstanceState);
        //VARIABLES A GUARDAR
        savedInstanceState.putInt("local", Integer.parseInt(mar_local.getText().toString()));
        savedInstanceState.putInt("visitante", Integer.parseInt(mar_visitante.getText().toString()));
    }

    /** * forma 1 de resturar el estado */
    public void restaurarEstado(Bundle savedInstanceState){

        if(savedInstanceState!=null){
            //VARIABLES A RESTAURAR
            local=savedInstanceState.getInt("local");
            mar_local.setText(String.valueOf(local));
            Log.d("local", String.valueOf(local));
            visitante=savedInstanceState.getInt("visitante");
            mar_visitante.setText(String.valueOf(visitante));
            Log.d("visitante", String.valueOf(visitante));
        }
    }
}

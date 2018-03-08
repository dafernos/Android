package com.example.blosa.pr_actividades1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {
    private TextView mensaje;
    private String mensajepasado;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensaje_layout);
        /* COGEMOS EL TEXTVIEW DONDE INSERTAR EL TEXTO */
        mensaje = findViewById(R.id.textView);
        /*CREAMOS EL ENLACE*/
        Intent intent=getIntent();
        /*COGEMOS LA VARIABLE QUE QUEREMOS GUARDAR EN EL NUEVO ACTIVITY*/
        mensajepasado= intent.getStringExtra(MainActivity.MENSAJE_MANDADO);
        mensaje.setText(mensajepasado);
    }
}

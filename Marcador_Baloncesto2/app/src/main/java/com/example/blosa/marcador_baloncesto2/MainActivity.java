package com.example.blosa.marcador_baloncesto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*CREAMOS UNA CONSTANTE LLAMADA MENSAJE_MANDADO QUE SERA EL QUE VAMOS A PASAR*/
    public static final String MENSAJE_MANDADO = "com.example.blosa.marcador_baloncesto2.MESSAGE";
    public static final String MENSAJE_MANDADO2 = "com.example.blosa.marcador_baloncesto2.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mandarMensaje(View view) {
        /* CREAMOS UN ENLACE A LA OTRA ACTIVITY*/
        Intent intent=new Intent(this, Juego.class);
        /* COGEMOS EL EDITTEXT DEL QUE QUEREMOS COGER EL TEXTO*/
        EditText local = (EditText) findViewById(R.id.editText);
        EditText visitante = (EditText) findViewById(R.id.editText2);
        /* COGEMOS EL VALOR DEL EDITTEXT QUE VAMOS A PASAR AL OTRO ACTIVITY*/
        String mensajeAPasar = local.getText().toString();
        String mensajeAPasar2 = visitante.getText().toString();
        /*LE DECIMOS QUE QUEREMOS PASAR UN PARAMETRO LLAMADO MENSAJEMANDADO CON EL VALOR DEL EDITTEXT*/
        intent.putExtra(MENSAJE_MANDADO,mensajeAPasar);
        intent.putExtra(MENSAJE_MANDADO2,mensajeAPasar2);
        /*Y LANZAMOS EL ACTIVITY NUEVO*/
        startActivity(intent);
    }
}

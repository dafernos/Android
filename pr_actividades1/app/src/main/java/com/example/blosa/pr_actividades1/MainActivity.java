package com.example.blosa.pr_actividades1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*CREAMOS UNA CONSTANTE LLAMADA MENSAJE_MANDADO QUE SERA EL QUE VAMOS A PASAR*/
    public static final String MENSAJE_MANDADO = "com.example.blosa.pr_actividades1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mandarMensaje(View view) {
        /* CREAMOS UN ENLACE A LA OTRA ACTIVITY*/
        Intent intent=new Intent(this, DisplayMessageActivity.class);
        /* COGEMOS EL EDITTEXT DEL QUE QUEREMOS COGER EL TEXTO*/
        EditText mensaje = (EditText) findViewById(R.id.editText);
        /* COGEMOS EL VALOR DEL EDITTEXT QUE VAMOS A PASAR AL OTRO ACTIVITY*/
        String mensajeAPasar = mensaje.getText().toString();
        /*LE DECIMOS QUE QUEREMOS PASAR UN PARAMETRO LLAMADO MENSAJEMANDADO CON EL VALOR DEL EDITTEXT*/
        intent.putExtra(MENSAJE_MANDADO,mensajeAPasar);
        /*Y LANZAMOS EL ACTIVITY NUEVO*/
        startActivity(intent);
    }
}

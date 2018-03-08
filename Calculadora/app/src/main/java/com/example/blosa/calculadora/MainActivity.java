package com.example.blosa.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,dot,suma,resta,divi,mult,igual,negpos,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n0= (Button) findViewById(R.id.n0);
        n1= (Button) findViewById(R.id.n1);
        n2= (Button) findViewById(R.id.n2);
        n3= (Button) findViewById(R.id.n3);
        n4= (Button) findViewById(R.id.n4);
        n5= (Button) findViewById(R.id.n5);
        n6= (Button) findViewById(R.id.n6);
        n7= (Button) findViewById(R.id.n7);
        n8= (Button) findViewById(R.id.n8);
        n9= (Button) findViewById(R.id.n9);
        dot= (Button) findViewById(R.id.c);
        c= (Button) findViewById(R.id.c);
        divi= (Button) findViewById(R.id.divi);
        igual= (Button) findViewById(R.id.igual);
        suma= (Button) findViewById(R.id.suma);
        resta= (Button) findViewById(R.id.resta);
        mult= (Button) findViewById(R.id.mult);
        negpos=(Button) findViewById(R.id.negpos);
        TxOperacion= (TextView) findViewById(R.id.TxOperacion);
        TxResultado= (TextView) findViewById(R.id.TxResultado);
    }





}

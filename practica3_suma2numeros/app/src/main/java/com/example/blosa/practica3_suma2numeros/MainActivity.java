package com.example.blosa.practica3_suma2numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    private int n1,n2,resultado;
    private EditText cn1,cn2;
    private TextView cresultado;
    private Button btSuma;
    private Spinner operacion;
    private String op1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn1 = findViewById(R.id.numero1);
        cn2 =(EditText) findViewById(R.id.numero2);
        btSuma = (Button) findViewById(R.id.button);
        cresultado = (TextView) findViewById(R.id.textView3);
        operacion = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.ops_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        operacion.setAdapter(adapter);
        btSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                op1= operacion.getSelectedItem().toString();
                switch (op1) {
                    case "Suma":
                        resultado = n1 + n2;
                        break;
                    case "Resta":
                        resultado = n1 - n2;
                        break;
                    case "Multiplicacion":
                        resultado = n1 * n2;
                        break;
                    case "Division":
                        resultado = n1 / n2;
                        break;
                }

                cresultado.setText(Integer.toString(resultado));
            }
        });
    }
}

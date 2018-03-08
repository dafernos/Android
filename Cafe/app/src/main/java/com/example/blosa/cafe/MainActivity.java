package com.example.blosa.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int quantity;
    private TextView numCafes;
    private Double precio = 3.5;
    private int adicional;
    private EditText nombre;
    private CheckBox crema, chocolate;
    private Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numCafes = (TextView) findViewById(R.id.textView3);
        quantity = Integer.parseInt(numCafes.getText().toString());
        nombre = (EditText) findViewById(R.id.editText);
        crema = (CheckBox) findViewById(R.id.checkBox);
        chocolate = (CheckBox) findViewById(R.id.checkBox2);
        order=(Button) findViewById(R.id.button3);
        order.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),
                        "Nombre: "+nombre.getText()+
                                "\nCrema? "+ seleccionado(crema)+
                                "\nChocolate? "+ seleccionado(chocolate)+
                                "\nCantidad: "+quantity+
                                "\nPrecio: "+(Double)(quantity*(precio+(adicional*0.5)))+"€"+
                                "\nGracias!", Toast.LENGTH_LONG).show();
                adicional=0;
            }

        });
    }
    public void increment(View view){
        if (quantity == 100){
            return;
        }
        quantity= quantity + 1;
        displayQuantity(quantity);
    }
    public String seleccionado(CheckBox chk){
        if(chk.isChecked()){
            adicional+=1;
        }
        return ""+chk.isChecked();
    }
    public void decrement(View view){
        if (quantity == 0){
            return;
        }
        quantity--;
        displayQuantity(quantity);
    }
    private void displayQuantity(int numberOfCoffees){
        TextView quantityTextView = (TextView) findViewById(R.id.textView3);
        quantityTextView.setText(Integer.toString(numberOfCoffees));
    }


}

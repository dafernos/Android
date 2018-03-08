package com.example.blosa.imagencoockies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view){
        texto = (TextView) findViewById(R.id.textView);
        texto.setText("I'm so full");
        imagen = (ImageView) findViewById(R.id.imageView);
        imagen.setImageResource(R.drawable.after_cookie);
    }
}

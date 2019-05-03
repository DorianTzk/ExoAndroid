package com.example.tuto1ex2;

import	android.app.Activity;
import	android.widget.Button;
import	android.os.Bundle;
import android.widget.EditText;
import  android.widget.Toast;
import  android.view.View;
import  android.view.View.OnClickListener;

public class Activity6 extends	Activity {

    private Button bouton1;

//ici rien de différents des exo précédants sauf que le texte du toast prend la valeur de la chaine de charactères dans la textebox du layout main 3
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        final EditText text = findViewById(R.id.editText); //nouvelle textBox et lien
        bouton1 = findViewById(R.id.button);
        bouton1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity6.this, text.getText(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}

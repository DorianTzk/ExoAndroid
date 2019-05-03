package com.example.tuto2ex5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import	android.view.View.OnClickListener;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent(); //récupère 'lintent de l'activité principale
        String mot = intent.getStringExtra("stock2"); //récupère la valeur contenu dans stock2 et la met dans mot
        TextView txt = findViewById(R.id.textView);
        Button bouton = findViewById(R.id.button2);


        if(mot.equals("arbre")){ //si mot contient la valeur "arbre"
            txt.setText("tree"); //le TextView txt prend la valeur "tree"
        }
        else {
            txt.setText("Ca passe pas");
        }
    }
}

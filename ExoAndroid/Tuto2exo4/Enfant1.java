package com.example.tuto2exo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//EXO 4

public class Enfant1  extends AppCompatActivity {

    private Button bouton1;
    private Button boutonAnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfant1);
        bouton1 = findViewById(R.id.button2);
        boutonAnn = findViewById(R.id.button3);

        bouton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setResult(RESULT_OK); //la variable result prend OK
                        finish(); //ferme l'activité et retourne sur la principale
                    }
                }
        );

        boutonAnn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setResult(RESULT_CANCELED); //la variable result prend CANCELED
                        finish(); //ferme l'activité et retourne sur la principale
                    }
                }
        );
    }




}

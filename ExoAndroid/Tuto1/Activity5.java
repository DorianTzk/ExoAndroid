package com.example.tuto1ex2;

import	android.app.Activity;
import	android.widget.Button;
import	android.os.Bundle;
import  android.widget.Toast;
import  android.view.View;
import  android.view.View.OnClickListener; // L'interface View.OnClickListener est maintenant importée par une autre classe

public	class Activity5 extends	Activity { //Appel de la classe mère Activity

    @Override
    public void onCreate(Bundle savedInstanceState){ //A chaque démarrage de l'appli, savedInstanceState charge les données qu'il contient sir l'appli a du etre recréee, ici il est vide
        super.onCreate(savedInstanceState); //Appel de la méthode de la classe mère
        setContentView(R.layout.main2); //Affiche du layout main2
        Button bouton1 = findViewById(R.id.button1); //Lien entre le layout et notre bouton
        bouton1.setOnClickListener( //on utilise la fonction de la classe importée de l'écouteur
                new OnClickListener() { //redéfinition de la méthode OnCLick
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity5.this, "TOAST BOUTON1", Toast.LENGTH_SHORT).show(); //comme dans les exos prédédants
                    }
                }
        );

        Button bouton2 = findViewById(R.id.button2);
        bouton2.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity5.this, "TOAST BOUTON 2", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}

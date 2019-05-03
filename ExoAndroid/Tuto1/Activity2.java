package com.example.tuto1ex2;

import	android.app.Activity;
import	android.widget.Button;
import	android.os.Bundle;
import  android.widget.Toast;
import  android.view.View;

//Elle s'appelle activité 2 mais c'est l'Exo3

public	class Activity2 extends	Activity implements View.OnClickListener{ //Appel de la classe mère Activity et l'interface View.OnClickListener


    @Override
    public	void onCreate(Bundle savedInstanceState)  //A chaque démarrage de l'appli, savedInstanceState charge les données qu'il contient sir l'appli a du etre recréee, ici il est vide
    {
        super.onCreate(savedInstanceState);// Appel de la méthode de la classe mère
        setContentView(R.layout.main2); //Affichage du layout main2
        Button	bouton1 = findViewById(R.id.button1); //Déclaration du bouton1 et lien a celui du layout
        bouton1.setOnClickListener(this); //Met un écouteur sur le bouton
    }

    public void onClick(View v){ //au clic du bouton
        Toast.makeText(this,"hh ! ", Toast.LENGTH_SHORT).show(); //affichage du toast
    }
}
package com.example.tuto1ex2;

import	android.app.Activity;
import	android.widget.Button;
import	android.os.Bundle;
import  android.widget.Toast;
import  android.view.View;

//Exo 4

public	class Activity4 extends	Activity implements View.OnClickListener{ //Appel de la classe mère Activity et l'interface View.OnClickListener

    private Button bouton1;
    private Button bouton2;//Déclarations des boutons

    public	void onCreate(Bundle savedInstanceState) { //A chaque démarrage de l'appli, savedInstanceState charge les données qu'il contient sir l'appli a du etre recréee, ici il est vide
        super.onCreate(savedInstanceState);  //Appel de la méthode de la classe mère
        setContentView(R.layout.main2); // Affiche du layout main2
        bouton1 = findViewById(R.id.button1);
        bouton1.setOnClickListener(this);
        bouton2 = findViewById(R.id.button2);
        bouton2.setOnClickListener(this); //Lien entre le bouton de l'activité et celui du layout puis mise en place de l'écouteur
    }

    public void onClick(View v){ //au clic du bouton
        if(v == bouton1){  //Si l'objet v de type View est le bouton1
            Toast.makeText(this,"CA MARCHE <3 ! ", Toast.LENGTH_SHORT).show(); //affichage du toast
        }
        else{
            Toast.makeText(this,"C'EST PAS LE BOUTON 1 ! ", Toast.LENGTH_SHORT).show(); //affichage du toast si on clique sur un autre bouton
        }

    }
}

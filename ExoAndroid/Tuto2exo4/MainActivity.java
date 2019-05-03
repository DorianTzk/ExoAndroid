package com.example.tuto2exo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import	android.app.Activity;
import	android.widget.Button;
import	android.os.Bundle;
import android.widget.EditText;
import  android.widget.Toast;
import  android.view.View;
import  android.view.View.OnClickListener;

// EXERCICE 4

public class MainActivity extends AppCompatActivity {

    private Button bouton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton1 = findViewById(R.id.button);
        bouton1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Bap = new Intent(MainActivity.this, Enfant1.class); //l'intent Bap de la MainActivity est relié a Enfant1
                        startActivityForResult(Bap, 1); //l'intent relié a l'activité enfant a pour code 1, il permet d'identifié quelle activité répond a l'éméttricice
                    }
                }
        );
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        switch(requestCode){ //selon quelle activité enfant répond
            case(1):
                switch(resultCode){ //Définition des différents cas

                    case RESULT_OK: //Si on a cliqué sur le bouton OK dans l'activité enfant
                        Toast.makeText(this, "Enfant 1 ok", Toast.LENGTH_SHORT).show();
                        return;

                    case RESULT_CANCELED: //Si on a cliqué sur le bouton RETOURN dans l'activité enfant
                        Toast.makeText(this, "Enfant 1 Annule", Toast.LENGTH_SHORT).show();
                        return;
                }
        }
    }
}

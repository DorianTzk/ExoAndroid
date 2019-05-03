package com.example.tuto2ex5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import	android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton = this.findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);//definition de l'intent relié a Main2Activity

                EditText stock = findViewById(R.id.editText); //Liaison entre l'attribut stock et l'item du layout
                String text=stock.getText().toString().trim();
                intent.putExtra("stock2",text); //ajout d'un extra a notre intent, la clé a pour nom stock2 et contient la variable text
                startActivity(intent);// envoie vers l'activité enfant
            }
        });


    }


}

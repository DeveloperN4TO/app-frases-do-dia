package com.n4to.dev.appfrasemotivacional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view) {

        String[] frases = {

                "Não limite os seus desafios. Desafie os seus limites. ",
                " Nada é tão ruim, que nao possa piorar! ",
                " O choro, dura uma noite, mas a alegria vem pela manha! ",
                "Uma meta é um sonho com prazo.",
                "Não perca o foco.",
                "Deus é fiel.",
                "Deus proverá.",

        };
        int numero = new Random().nextInt (7);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText ( frases [numero] );




    }



}

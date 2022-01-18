package com.udc.tiradados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Instanciando Boton
        Button BotonLanzar;
        BotonLanzar = findViewById(R.id.btnTiraDados);

        //Linkeando Imagenes a los dados
        final ImageView dadoIzquierdo =  findViewById(R.id.ImgDado1);

        final ImageView dadoDerecho = findViewById(R.id.ImgDado2);

        //Creando Arreglo para establecer las imagenes por numero
        final int[] diceArray = {
                R.drawable.x1,
                R.drawable.x2,
                R.drawable.x3,
                R.drawable.x4,
                R.drawable.x5,
                R.drawable.x6

        };


        // estableciendo el evento click al boton
        BotonLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dados", "El Boton debe ser presionado");

                // creando el generador de numeros aleatorios
                Random generaNumero = new Random();

                // generando el primer numero aleatorio de 1 a 6
                int numero1 = generaNumero.nextInt(6);
                int numero2 = generaNumero.nextInt(6);


                // Guardando el numero en el log
                Log.d("dado1", "el numero generado es " + numero1);
                Log.d("dado2", "el numero generado es " + numero2);

                // estableciendo las imagenes a los dados de acuerdo al numero generado

                dadoIzquierdo.setImageResource(diceArray[numero1]);
                dadoDerecho.setImageResource(diceArray[numero2]);
            }
        });

    }
}
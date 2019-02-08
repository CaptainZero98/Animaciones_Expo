package com.example.leona.animaciones_personalizadas;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    //Declaramos las variables a utilizar
    ObjectAnimator animation;//La clase object animatot se utiliza para los metodos de animación
    TextView tvPrueba;
    Button btnGiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        tvPrueba=findViewById(R.id.tvPrueba);
        btnGiro=findViewById(R.id.btnGiro);//VInculamos variables
        btnGiro.setOnClickListener(new View.OnClickListener() {//Se utiliza un botón para iniciar el giro
            @Override
            public void onClick(View v) {
                animation= ObjectAnimator.ofFloat(tvPrueba, "rotationY", 360f);//Se determina el objeto a animar, y el tipo
                //de animación que va a realizar.
                animation.setDuration(10000);//Duración de la animación
                animation.start();//Inicia la animación

            }
        });

    }


}

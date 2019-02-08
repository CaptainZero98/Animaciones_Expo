package com.example.leona.animaciones_leo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {
AnimationDrawable adWifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ImageView imgImagen=findViewById(R.id.imgWifi);//Vinculamos el animation drawable y el image View
        imgImagen.setBackgroundResource(R.drawable.animation);//Iniciamos agregando al imageView un background, que en este caso inicicia con el primer elemento del Animation-List
        adWifi=(AnimationDrawable) imgImagen.getBackground();//Obetnemos el bacground del imageView para el animation drawable

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {//Sobreescribimos el metodo onWindowFocusChanged para que inicie la animación
        super.onWindowFocusChanged(hasFocus);

        adWifi.start();
    }
}

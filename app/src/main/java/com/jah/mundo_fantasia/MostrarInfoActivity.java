package com.jah.mundo_fantasia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MostrarInfoActivity extends AppCompatActivity {

    Intent intent;
    String fragment;
    TextView lblTitulo, lblDescripcion;
    ImageView imgImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);
        initComponents();
    }

    private void initComponents() {
        intent = getIntent();
        fragment = intent.getStringExtra("fragment");
        lblTitulo = findViewById(R.id.lblTitulo);
        lblDescripcion = findViewById(R.id.lblDescripcion);
        imgImagen = findViewById(R.id.imgImagen);
        if(fragment.equals("tierra")){
            mostrarInformacion(1);
        }else if(fragment.equals("personaje")){
            mostrarInformacion(2);
        }else{
            mostrarInformacion(3);
        }
    }

    private void mostrarInformacion(int posicion) {
        if(posicion == 1){
            Tierra tierra = (Tierra) intent.getSerializableExtra(fragment);
            lblTitulo.setText(tierra.getNombre());
            lblDescripcion.setText(tierra.getDescrpcion());
            imgImagen.setImageResource(tierra.getImagen());
        }else if(posicion == 2){
            Personaje personaje = (Personaje) intent.getSerializableExtra(fragment);
            lblTitulo.setText(personaje.getNombre());
            lblDescripcion.setText(personaje.getDescrpcion());
            imgImagen.setImageResource(personaje.getImagen());
        }else{
            Arma arma = (Arma) intent.getSerializableExtra(fragment);
            lblTitulo.setText(arma.getNombre());
            lblDescripcion.setText(arma.getDescrpcion());
            imgImagen.setImageResource(arma.getImagen());
        }
    }
}
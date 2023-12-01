package com.example.compararplantetas_5interfaces;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.filament.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView1, autoCompleteTextView2;
    ArrayAdapter<Planeta> adapter;
    TextView diametro1, distancia1, densidad1;
    TextView diametro2, distancia2, densidad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa tus AutoCompleteTextViews
        autoCompleteTextView1 = findViewById(R.id.autoCompleteTextView1);
        autoCompleteTextView2 = findViewById(R.id.autoCompleteTextView2);
        diametro1 = findViewById(R.id.text1);
        distancia1 = findViewById(R.id.text2);
        densidad1 = findViewById(R.id.text3);
        diametro2 = findViewById(R.id.text4);
        distancia2 = findViewById(R.id.text5);
        densidad2 = findViewById(R.id.text6);





        // Crea tu lista de planetas
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(new Planeta("Mercurio", 0.382, 0.387, 5400));
        planetas.add(new Planeta("Venus", 0.949, 0.723, 5250));
        planetas.add(new Planeta("Tierra", 1, 1, 5520));
        planetas.add(new Planeta("Marte", 0.53, 1.542, 3960));
        planetas.add(new Planeta("Jupiter", 11.2, 5.203, 1350));
        planetas.add(new Planeta("Saturno", 9, 0.387, 5400));
        planetas.add(new Planeta("Urano", 3.38, 19.81, 1200));
        planetas.add(new Planeta("Neptuno", 3.81, 30.07, 1500));
        planetas.add(new Planeta("Pluton", 0, 39.44, 5));

        //configurar array adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, planetas);
        autoCompleteTextView1.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter);



        // Configura el listener para autoCompleteTextView1
        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, android.view.View view, int i, long l) {
                Planeta planetaSeleccionado = (Planeta) adapterView.getItemAtPosition(i);
                diametro1.setText(String.valueOf(planetaSeleccionado.getDiametro()));
                distancia1.setText(String.valueOf(planetaSeleccionado.getDistanciaSol()));
                densidad1.setText(String.valueOf(planetaSeleccionado.getDensidad()));
            }

        });

        // Configura el listener para autoCompleteTextView2
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, android.view.View view, int i, long l) {
                Planeta planetaSeleccionado = (Planeta) adapterView.getItemAtPosition(i);
                diametro2.setText(String.valueOf(planetaSeleccionado.getDiametro()));
                distancia2.setText(String.valueOf(planetaSeleccionado.getDistanciaSol()));
                densidad2.setText(String.valueOf(planetaSeleccionado.getDensidad()));
            }


        });


    }
}


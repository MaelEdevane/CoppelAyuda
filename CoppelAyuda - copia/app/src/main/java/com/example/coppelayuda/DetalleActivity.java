package com.example.coppelayuda;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    private TextView procesoTextView, rutaTextView, explicacionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Inicializa las vistas de texto
        procesoTextView = findViewById(R.id.procesoTextView);
        rutaTextView = findViewById(R.id.rutaTextView);
        explicacionTextView = findViewById(R.id.explicacionTextView);

        // Obtiene los datos pasados desde la actividad anterior
        String proceso = getIntent().getStringExtra("proceso");
        String ruta = getIntent().getStringExtra("ruta");
        String explicacion = getIntent().getStringExtra("explicacion");

        // Muestra los datos en las vistas de texto
        procesoTextView.setText("Proceso: " + proceso);
        rutaTextView.setText("Ruta: " + ruta);
        explicacionTextView.setText("Explicación: " + explicacion);
    }
}

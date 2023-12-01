package com.example.coppelayuda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

enum ProviderType {
    BASIC
}


public class HomeActivity extends AppCompatActivity {

    Button ropa_button;
    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ropa_button = findViewById(R.id.ropa_button);
        welcomeTextView = findViewById(R.id.welcomeTextView);

        ropa_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ropa_button = new Intent(HomeActivity.this, RopaActivity.class);
                startActivity(ropa_button);
            }
        });

        // Obtener la hora actual
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        // Mostrar un mensaje de bienvenida basado en la hora
        String welcomeMessage;
        if (hour >= 0 && hour < 12) {
            welcomeMessage = "Buenos días, ¡bienvenido!";
        } else if (hour >= 12 && hour < 18) {
            welcomeMessage = "Buenas tardes, ¡bienvenido!";
        } else {
            welcomeMessage = "Buenas noches, ¡bienvenido!";
        }

        // Establecer el mensaje de bienvenida en el TextView
        welcomeTextView.setText(welcomeMessage);
    }
}
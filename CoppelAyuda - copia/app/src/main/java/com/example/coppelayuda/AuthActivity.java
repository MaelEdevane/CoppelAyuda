package com.example.coppelayuda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class AuthActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button singUpButton, logInButton;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        // SetUp
        setup();
    }

    private void setup() {
        title = "authentication";
        singUpButton = findViewById(R.id.singUpButton);
        logInButton = findViewById(R.id.logInButton);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!emailEditText.getText().toString().isEmpty() &&
                        !passwordEditText.getText().toString().isEmpty()) {
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                            emailEditText.getText().toString(),
                            passwordEditText.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        showHome(task.getResult().getUser().getEmail(), ProviderType.BASIC);
                                        // Registro exitoso
                                    } else {
                                        showAlert();
                                    }
                                }
                            });
                }
            }
        });

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!emailEditText.getText().toString().isEmpty() &&
                        !passwordEditText.getText().toString().isEmpty()) {
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(
                            emailEditText.getText().toString(),
                            passwordEditText.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        showHome(task.getResult().getUser().getEmail(), ProviderType.BASIC);
                                        // Inicio de sesión exitoso
                                    } else {
                                        showAlert();
                                    }
                                }
                            });
                }
            }
        });
    }

    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage("Se ha producido un error autenticando al usuario");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Código para manejar el clic en "Aceptar"
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showHome(String email, ProviderType provider) {
        // Código para mostrar la pantalla de inicio
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homeIntent.putExtra("email", email);
        homeIntent.putExtra("provider", provider.name());
        startActivity(homeIntent);
    }
}


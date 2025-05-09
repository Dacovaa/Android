package com.example.aulalayoutfateczn;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCadastro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Button btnCadastrar = findViewById(R.id.button10);
        EditText nome = findViewById(R.id.editTextText3);
        EditText email = findViewById(R.id.editTextTextEmailAddress3);
        EditText senha = findViewById(R.id.editTextNumberPassword);



        btnCadastrar.setOnClickListener(v -> {

        });
    }
}

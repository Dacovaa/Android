package com.example.aulalayoutfateczn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextSenha = findViewById(R.id.editTextTextPassword2);
        Button btnEnviar = findViewById(R.id.button);

        btnEnviar.setOnClickListener(v -> {
            String senha = editTextSenha.getText().toString();

            Intent intent = new Intent(MainActivity.this, ActivityFormatacao.class);
            intent.putExtra("SENHA", senha);

            startActivity(intent);
        });
    }

    public void gotoFormatacao(View view){
        Intent intent = new Intent(MainActivity.this, ActivityFormatacao.class);
        startActivity(intent);
    }

    }

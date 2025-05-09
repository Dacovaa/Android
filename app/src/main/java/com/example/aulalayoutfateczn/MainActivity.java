package com.example.aulalayoutfateczn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.DocumentReference;


import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FIREBASE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mandando parametro pelo editText para outra pagina.
        EditText editTextSenha = findViewById(R.id.editTextTextPassword2);
        Button btnEnviar = findViewById(R.id.button);

        btnEnviar.setOnClickListener(v -> {
            String senha = editTextSenha.getText().toString();

            Intent intent = new Intent(MainActivity.this, ActivityFormatacao.class);
            intent.putExtra("SENHA", senha);

            startActivity(intent);
        });

        //TESTE DO FIREBASE ---------------------------------------------------------------

        FirebaseApp.initializeApp(this);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // Criando um exemplo de dado
        Map<String, Object> user = new HashMap<>();
        user.put("nome", "Leilah");
        user.put("idade", 19);

        db.collection("usuarios")
                .add(user)
                .addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "Documento adicionado com ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() {
                    @Override
                    public void onFailure(Exception e) {
                        Log.w(TAG, "Erro ao adicionar documento", e);
                    }
                });
    }

    public void gotoFormatacao(View view){
        Intent intent = new Intent(MainActivity.this, ActivityFormatacao.class);
        startActivity(intent);
    }
    public void gotoCadastro (View view) {
        Intent intent = new Intent(MainActivity.this, ActivityCadastro.class);
        startActivity(intent);
    }
    public void gotoRecuperar (View view) {
        Intent intent = new Intent(MainActivity.this, ActivityRecuperar.class);
        startActivity(intent);
    }


    }

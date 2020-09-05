package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = findViewById(R.id.nomepessoa);
        Button botaoSalvar = (Button) findViewById(R.id.button2);
        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {

                String nomeValue = nome.getText().toString();

                Intent intent = new Intent( MainActivity.this, MainActivity2.class );

                intent.putExtra("nome", nomeValue);
                startActivity(intent);
                finish();
            }
        });
    }
}
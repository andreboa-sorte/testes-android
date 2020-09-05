package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        sobrenome = findViewById(R.id.sobrenome);
        Button botaoSalvar = (Button) findViewById(R.id.button2);
        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {

                String sobrenomeValue = sobrenome.getText().toString();

                Intent intent = new Intent( MainActivity2.this, MainActivity.class );

                intent.putExtra("sobrenome", sobrenomeValue);
                startActivity(intent);
                finish();
            }
        });


    }
}
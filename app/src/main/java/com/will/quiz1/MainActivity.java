package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText idedit;
    private EditText nameedit;
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        idedit = findViewById(R.id.idedit);
        nameedit = findViewById(R.id.nameedit);
        nextbtn = findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.nextbtn:


                SharedPreferences preferences = getSharedPreferences("data", MODE_PRIVATE);

                String registroactual = preferences.getString("registros", "");

                String username = nameedit.getText().toString();
                String id = idedit.getText().toString();

                String registro = registroactual + ":" + username;

                preferences.edit().putString("registros", registro).apply();

                if (username.trim().isEmpty()) {
                    Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (id.trim().isEmpty()) {
                    Toast.makeText(this, "Escribe tu identificación", Toast.LENGTH_SHORT).show();
                    return;
                }




                    finish();

                    Intent i = new Intent(this, poll.class);
                    startActivity(i);


                    Log.e("username", username);
                    Log.e("id", id);

                    break;


                }


        }
    }


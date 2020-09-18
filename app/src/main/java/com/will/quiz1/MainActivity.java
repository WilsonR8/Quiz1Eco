package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText idedit;
    private EditText nameedit;
    private TextView nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        idedit=findViewById(R.id.idedit);
        nameedit=findViewById(R.id.nameedit);
        nextbtn=findViewById(R.id.nextbtn);



        nextbtn.setOnClickListener(
                (v)->{
                    String username = nameedit.getText().toString();
                    String id= idedit.getText().toString();
                    Intent i = new Intent(this,poll.class);
                    i.putExtra("username",username);
                    i.putExtra("id",id);
                    startActivity(i);


                    Log.e("username", username);
                    Log.e("id",id);


                });









    }




}
package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class polldone extends AppCompatActivity {
    private TextView nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polldone);

        nextbtn=findViewById(R.id.nextbtn);


        nextbtn.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);





                });
    }
}
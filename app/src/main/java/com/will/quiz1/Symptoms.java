package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Symptoms extends AppCompatActivity {

    private TextView nextbtn;
    private CheckBox check6;
    private CheckBox check7;
    private CheckBox check8;
    private CheckBox check9;
    private CheckBox check10;
    private CheckBox check11;
    private CheckBox check12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        nextbtn=findViewById(R.id.nextbtn);
        check6=findViewById(R.id.check6);
        check7=findViewById(R.id.check7);
        check8=findViewById(R.id.check8);
        check9=findViewById(R.id.check9);
        check10=findViewById(R.id.check10);
        check11=findViewById(R.id.check11);
        check12=findViewById(R.id.check12);





        nextbtn.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this,polldone.class);
                    startActivity(i);





                });



    }
}
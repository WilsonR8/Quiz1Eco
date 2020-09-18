package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class poll extends AppCompatActivity {
    private TextView nextbtn;
    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poll);

        nextbtn=findViewById(R.id.nextbtn);
        check1=findViewById(R.id.check1);
        check2=findViewById(R.id.check2);
        check3=findViewById(R.id.check3);
        check4=findViewById(R.id.check4);
        check5=findViewById(R.id.check5);

        if(check5.isChecked()){
            check1.isChecked();
        }



        nextbtn.setOnClickListener(
                (v)->{

                    if(check1.isChecked()||check2.isChecked()||check3.isChecked()||check4.isChecked()) {

                        Intent i = new Intent(this, Symptoms.class);
                        startActivity(i);
                    }


                });





    }
}
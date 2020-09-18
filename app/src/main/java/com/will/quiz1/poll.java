package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class poll extends AppCompatActivity implements View.OnClickListener {
    private Button nextbtn;
    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;
    private int pollnex;


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
        pollnex=0;



        check1.setOnClickListener(this);
        check2.setOnClickListener(this);
        check3.setOnClickListener(this);
        check4.setOnClickListener(this);
        check5.setOnClickListener(this);







        nextbtn.setOnClickListener(
                (v)->{

                    if(check1.isChecked()||check2.isChecked()||check3.isChecked()||check4.isChecked()||check5.isChecked()) {

                        Intent i = new Intent(this, Symptoms.class);
                        startActivity(i);

                        Log.e("pollnex", String.valueOf(pollnex));
                    }


                });

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.check5:

            if(check5.isChecked()==true){
                check1.setChecked(false);
                check2.setChecked(false);
                check3.setChecked(false);
                check4.setChecked(false);
                pollnex=0;

            }

            break;

            case R.id.check1:

            if(check1.isChecked()==true){
                pollnex+=3; }else{
                pollnex-=3;
            }
            break;

            case R.id.check2:

            if(check2.isChecked()==true){
                pollnex+=3;
            }else{
                pollnex-=3;
            }

            break;

            case R.id.check3:
            if(check3.isChecked()==true){
                pollnex+=3;
            }else{
                pollnex-=3;
            }

            break;

            case R.id.check4:
            if(check4.isChecked()==true){
                pollnex+=3;
            }else{
                pollnex-=3;
            }

            break;


        }



    }
}
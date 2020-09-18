package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Symptoms extends AppCompatActivity implements View.OnClickListener {

    private Button nextbtn;
    private CheckBox check6;
    private CheckBox check7;
    private CheckBox check8;
    private CheckBox check9;
    private CheckBox check10;
    private CheckBox check11;
    private CheckBox check12;
    private int pollsymps;

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
        pollsymps=0;


        check6.setOnClickListener(this);
        check7.setOnClickListener(this);
        check8.setOnClickListener(this);
        check9.setOnClickListener(this);
        check10.setOnClickListener(this);
        check11.setOnClickListener(this);
        check12.setOnClickListener(this);




        nextbtn.setOnClickListener(
                (v)->{

                    if(check6.isChecked()||check7.isChecked()||check8.isChecked()||check9.isChecked()||check10.isChecked()||check11.isChecked()||check12.isChecked()) {
                        Intent i = new Intent(this, polldone.class);
                        startActivity(i);

                        Log.e("pollsyms", String.valueOf(pollsymps));
                    }




                });



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.check12:

                if(check12.isChecked()==true){
                    check6.setChecked(false);
                    check7.setChecked(false);
                    check8.setChecked(false);
                    check9.setChecked(false);
                    check10.setChecked(false);
                    check11.setChecked(false);
                    pollsymps=0;

                }

                break;

            case R.id.check6:

                if(check6.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }
                break;

            case R.id.check7:

                if(check7.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }

                break;

            case R.id.check8:

                if(check8.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }

                break;

            case R.id.check9:

                if(check9.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }

                break;

            case R.id.check10:

                if(check10.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }

                break;

            case R.id.check11:

                if(check11.isChecked()==true){
                    pollsymps+=4; }else{
                    pollsymps-=4;
                }

                break;




    }
}
}
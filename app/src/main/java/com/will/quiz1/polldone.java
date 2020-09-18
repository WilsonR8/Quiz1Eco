package com.will.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class polldone extends AppCompatActivity implements View.OnClickListener {
    private Button nextbtn;
    private TextView polldonetxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polldone);

        nextbtn=findViewById(R.id.nextbtn);
        polldonetxt=findViewById(R.id.polldonetxt);

        nextbtn.setOnClickListener(this);

    }

    protected void onResume() {

        super.onResume();

        SharedPreferences preferences = getSharedPreferences("data",MODE_PRIVATE);
        String registros = preferences.getString("registros","");

        String[] namelist=registros.split(":");

        polldonetxt.setText("");
        for (int i=0;i<namelist.length;i++){
            polldonetxt.append(namelist[i] + "\n");
        }



        }

    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.nextbtn:
    Intent i = new Intent(this,MainActivity.class);
    startActivity(i);
    break;



}


    }
}




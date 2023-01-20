package com.example.skill2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la anonima", Toast.LENGTH_LONG).show();
            }
        });

        }

    @Override
    public void onClick(View view) {
        /*
        if (view.getId()==btn2.getId()){
            Toast.makeText(getApplicationContext(), "Desde onlick del implements", Toast.LENGTH_LONG).show();
        }
        if (view.getId()==R.id.button5){
            Toast.makeText(getApplicationContext(), "Desde onlick del metodo", Toast.LENGTH_LONG).show();
        }*/

        switch (view.getId()){
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "Desde onlick del metodo", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), "Desde onlick del implements", Toast.LENGTH_LONG).show();
                break;
        }
    }
/*
    public void eventBotton(View view){
        Toast.makeText(getApplicationContext(), "Desde onlick del metodo", Toast.LENGTH_LONG).show();

    }*/
}
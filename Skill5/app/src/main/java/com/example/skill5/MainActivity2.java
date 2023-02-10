package com.example.skill5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<PersonajeVo>lisaPersonajes;
    RecyclerView recyclerPersonajes;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lisaPersonajes=new ArrayList<>();
        recyclerPersonajes= (RecyclerView) findViewById(R.id.recyclerdId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
llenarPersonajes();
    AdaptadorPersonajes adapter= new AdaptadorPersonajes(lisaPersonajes);
    recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        lisaPersonajes.add(new PersonajeVo("Homer", "niño",R.drawable.bart ));
        lisaPersonajes.add(new PersonajeVo("Homer", "padre",R.drawable.homer ));
    }
}
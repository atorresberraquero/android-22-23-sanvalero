package com.example.skill5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recycler=(RecyclerView) findViewById(R.id.recyclerdId);
    //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    recycler.setLayoutManager(new GridLayoutManager(this, 2));
        listDatos=new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            listDatos.add("Datos # " +i+ " ");

        }
Adapter adapter=new Adapter(listDatos);
        recycler.setAdapter(adapter);
    }
}
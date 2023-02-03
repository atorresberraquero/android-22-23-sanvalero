package com.example.skill4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    ListView listaDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        listaDias = (ListView)findViewById(R.id.listviewid);
        ArrayAdapter<CharSequence>adaptador = ArrayAdapter.createFromResource(this,R.array.arrayDias,
                android.R.layout.simple_list_item_1);

        listaDias.setAdapter(adaptador);

        listaDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "selecciona"+ parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
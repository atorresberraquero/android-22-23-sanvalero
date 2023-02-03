package com.example.skill4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {
    CheckBox c1;
    CheckBox c2;
    RadioButton r1;
    RadioButton r2;
    ToggleButton tgbtn;
    TextView edtText;
    TextView edtText2;
    Switch switchE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c1 = (CheckBox) findViewById(R.id.idChec1);
        c1 = (CheckBox) findViewById(R.id.idChec2);
        r1 = (RadioButton) findViewById(R.id.idRad1);
        r2 = (RadioButton) findViewById(R.id.idRad2);
        tgbtn = (ToggleButton) findViewById(R.id.tgbtn1);
        edtText = (TextView) findViewById(R.id.etSeleccion);
        edtText2 = (TextView) findViewById(R.id.etSeleccion2);
        switchE = (Switch) findViewById(R.id.idSwitch);
    }
    public void onclick(View view){
        if(view.getId() == R.id.btn1){
            validar();
        }
        if (view.getId() == R.id.tgbtn1){
            if(tgbtn.isChecked()){
                edtText.setText("Boton On");
            }else{
                edtText.setText("Boton Off");
            }

        }
        if(view.getId()==R.id.idSwitch){
                if(switchE.isChecked()){
                    edtText2.setText("Esta activado");
                }else{
                    edtText2.setText("No esta activado");
                }
        }
    }
    private void validar(){
            String cadena="Selecciondo: \n";

            if(c1.isChecked()){
                cadena+="Opcion1 \n";
            }

            if(c2.isChecked()){
                cadena+="Opcion2";
            }
            if(r1.isChecked()){
                cadena+="Opcion 1 del radio";
            }
            if(r2.isChecked()){
                cadena+="Opcion 2 del radio";
            }



            Toast.makeText(getApplicationContext(),cadena,Toast.LENGTH_SHORT).show();
    }
}

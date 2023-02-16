package com.example.pokemon.lst_pokemons.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pokemon.R;
import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.lst_pokemons.LstPokemonContract;

import java.util.ArrayList;

public class LstPokemonActivity extends AppCompatActivity implements LstPokemonContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_pokemons);
    }

    @Override
    public void successLstPokemon(ArrayList<Pokemon> lstPokemon) {

    }

    @Override
    public void failureLstPokemon(String error) {

    }
}
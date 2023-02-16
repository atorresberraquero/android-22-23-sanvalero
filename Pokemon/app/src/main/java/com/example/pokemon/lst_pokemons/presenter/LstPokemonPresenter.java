package com.example.pokemon.lst_pokemons.presenter;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.lst_pokemons.LstPokemonContract;
import com.example.pokemon.lst_pokemons.model.LstPokemonModel;

import java.util.ArrayList;

public class LstPokemonPresenter implements LstPokemonContract.Presenter {
    private LstPokemonModel lstPokemonModel;
    private LstPokemonContract.View view;
    public LstPokemonPresenter(LstPokemonContract.View view){
        this.view = view;
        lstPokemonModel = new LstPokemonModel();
    }
    @Override
    public void lstPokemon(Pokemon pokemon) {
        lstPokemonModel.lstPokemonWS(null, new LstPokemonContract.Model.OnLstPokemonListener(){

            @Override
            public void onSuccess(ArrayList<Pokemon> lstPokemon) {
                view.successLstPokemon(lstPokemon);
            }

            @Override
            public void onFailure(String error) {
                view.failureLstPokemon(error);
            }
        });
    }


}
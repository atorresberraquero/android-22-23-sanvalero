package com.example.pokemon.lst_pokemons.model;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.entities.PokemonRespuesta;
import com.example.pokemon.lst_pokemons.LstPokemonContract;
import com.example.pokemon.utils.ApiClient;
import com.example.pokemon.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstPokemonModel implements LstPokemonContract.Model {
    @Override
    public void lstPokemonWS(Pokemon pokemon, OnLstPokemonListener onLstPokemonListener) {

        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<PokemonRespuesta> call = apiService.getPokemons(10,10);
        call.enqueue(new Callback<PokemonRespuesta>() {
            @Override
            public void onResponse(Call<PokemonRespuesta> call,
                                   Response<PokemonRespuesta> response) {

                PokemonRespuesta pokemonRespuesta = response.body();
                ArrayList<Pokemon> listaPokemon = pokemonRespuesta.getResults();

            }

            @Override
            public void onFailure(Call<PokemonRespuesta> call, Throwable t) {

            }
        });
        /*
        onLstPokemonListener.onSuccess();
        onLstPokemonListener.onFailure();
        */
    }
}
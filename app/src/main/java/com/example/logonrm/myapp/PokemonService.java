package com.example.logonrm.myapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface PokemonService {

    @GET("/api/v2/pokemon/{numero}")
    Call<Pokemon> buscarPokemon(@Path(value = "numero")String numero);

}

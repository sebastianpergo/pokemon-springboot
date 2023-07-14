package com.demo.pokemon.service;

import com.demo.pokemon.model.PokemonModel;
import com.demo.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    // Inyeccion de dependencias
    @Autowired
    PokemonRepository pokemonRepository;

    // Create
    public void createPokemon(PokemonModel pokemonModel) {
        pokemonRepository.save(pokemonModel);
    }
    public void getPokemon() {
        System.out.println("Get Pokemon");
    }

    public void deletePokemon() {
        System.out.println("Delete Pokemon");
    }

    public void updatePokemon() {
        System.out.println("Update Pokemon");
    }


}

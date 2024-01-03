package com.demo.pokemon.service;

import com.demo.pokemon.model.PokemonModel;
import com.demo.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

    // Inyeccion de dependencias
    @Autowired
    PokemonRepository pokemonRepository;

    // Create
    public void createPokemon(PokemonModel pokemonModel) {
        pokemonRepository.save(pokemonModel);
    }
    public List<PokemonModel> getPokemon() {
        List<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
        pokemonList.addAll(pokemonRepository.findAll());
        return pokemonList;
    }

    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
        System.out.println("Delete Pokemon");
    }

    public void updatePokemon(Long id) {

    }


}

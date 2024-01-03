package com.demo.pokemon.controller;

import com.demo.pokemon.model.PokemonModel;
import com.demo.pokemon.repository.PokemonRepository;
import com.demo.pokemon.service.PokemonService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    private String hello() {
        return "Welcome to Pokemon API";
    }

    @PostMapping("/pokemon/create")
    private String createPokemon(@RequestBody PokemonModel pokemonModel) {
        pokemonService.createPokemon(pokemonModel);
        return "Pokemon created";
    }

    @DeleteMapping("/pokemon/{id}")
    private String deletePokemon(@PathVariable("id") long id){
        pokemonService.deletePokemon(id);
        return "Pokemon deleted";
    }



    @GetMapping("/pokemon/get")
    private List<PokemonModel> getPokemon() {
        return pokemonService.getPokemon();
    }


}

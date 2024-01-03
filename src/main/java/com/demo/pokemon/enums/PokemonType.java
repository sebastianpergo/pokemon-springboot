package com.demo.pokemon.enums;

import jakarta.persistence.Table;

@Table(name = "tb_tipo")
public enum PokemonType {
    FIRE,
    WATER,
    PLANT,
    ELECTRIC
}

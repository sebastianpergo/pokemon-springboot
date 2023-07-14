package com.demo.pokemon.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
// @Data same as @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Getter
@Setter
@Table(name = "tb_pokemon")
public class PokemonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPokemon;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long health;

    @Column(nullable = false)
    private Long attack;

    @Column(nullable = false)
    private char status;
}

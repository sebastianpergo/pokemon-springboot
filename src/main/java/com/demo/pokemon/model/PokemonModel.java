package com.demo.pokemon.model;

import com.demo.pokemon.enums.PokemonType;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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

    @Enumerated(EnumType.STRING)
    @Column(name="tipo",nullable = false)
    private PokemonType pokemonType;

    @Column(nullable = false)
    private char status;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name ="id_entrenador")
//    private TrainerModel trainerModel;
}
package com.demo.pokemon.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "tb_trainer")
public class TrainerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_entrenador")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private char status;

//    @OneToMany(mappedBy = "trainerModel", cascade = CascadeType.ALL)
//    private List<PokemonModel> pokemonModelList;
}

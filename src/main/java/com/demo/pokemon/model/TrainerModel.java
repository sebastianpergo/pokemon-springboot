package com.demo.pokemon.model;

import jakarta.persistence.*;
import lombok.*;

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

    private char status;
}

package com.demo.pokemon.repository;

import org.springframework.stereotype.Repository;
import com.demo.pokemon.model.TrainerModel;
import org.springframework.data.jpa.repository.JpaRepository;

    @Repository
    public interface TrainerRepository extends JpaRepository<TrainerModel, Long> {

    }


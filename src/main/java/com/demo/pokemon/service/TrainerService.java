package com.demo.pokemon.service;

import com.demo.pokemon.model.TrainerModel;
import com.demo.pokemon.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    // Inyeccion de dependencias
    @Autowired
    TrainerRepository trainerRepository;

    // Create the Trainer
    public void createTrainer(TrainerModel trainerModel) {
        trainerRepository.save(trainerModel);
    }

}

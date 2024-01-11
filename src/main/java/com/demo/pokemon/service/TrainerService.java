package com.demo.pokemon.service;

import com.demo.pokemon.model.TrainerModel;
import com.demo.pokemon.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerService {
    // Inyeccion de dependencias
    @Autowired
    TrainerRepository trainerRepository;

    // Create
    public void createTrainer(TrainerModel trainerModel) {
        trainerRepository.save(trainerModel);
    }

    // Read
    public List<TrainerModel> getTrainer() {
        List<TrainerModel> trainerList = new ArrayList<TrainerModel>();
        trainerList.addAll(trainerRepository.findAll());
        return trainerList;
    }

    // Update


    // Delete
    public void deleteTrainer(Long id) {
        trainerRepository.deleteById(id);
        System.out.println("Delete Trainer");
    }

}

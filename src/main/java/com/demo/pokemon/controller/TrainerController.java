package com.demo.pokemon.controller;

import com.demo.pokemon.model.TrainerModel;
import com.demo.pokemon.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
    // Inyeccion de dependencias
    @Autowired
    TrainerService trainerService;

    // Create
    @PostMapping("/trainer/create")
    private String createTrainer(@RequestBody TrainerModel trainerModel){
        trainerService.createTrainer(trainerModel);
        return "Trainer created";
    }

}

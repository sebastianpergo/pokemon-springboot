package com.demo.pokemon.controller;

import com.demo.pokemon.model.TrainerModel;
import com.demo.pokemon.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // Read
    @GetMapping("/trainer/get")
    private List<TrainerModel> getTrainer(){
        return trainerService.getTrainer();
    }

    // Update


    // Delete
    @DeleteMapping("/trainer/{id}")
    private String deleteTrainer(@PathVariable("id") long id){
        trainerService.deleteTrainer(id);
        return "Trainer deleted";
    }

}

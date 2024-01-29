package com.UppgiftApiBackend.UppgiftApiBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UppgiftApiBackend.UppgiftApiBackend.model.meals;
import com.UppgiftApiBackend.UppgiftApiBackend.repository.MealsRepository;

@Service
public class MealsService {
    
    private final MealsRepository mealsRepository;

    @Autowired
    public MealsService(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }

    //GET en specifik meal från databasen
    public meals getMeal(Integer id) {
        return mealsRepository.findById(id).orElse(null);
    }

    //GET alla böcker i vår databas
    public List<meals> getAllMeals() {
        return mealsRepository.findAll();
    }

    //POST en ny meal till databasen
    public meals addMeal(meals meal) {
        mealsRepository.save(meal);
        return meal;
    }
}

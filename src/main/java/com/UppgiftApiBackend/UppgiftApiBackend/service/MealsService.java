package com.UppgiftApiBackend.UppgiftApiBackend.service;

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

    public meals addMeal(meals meal) {
        mealsRepository.save(meal);
        return meal;
    }
}

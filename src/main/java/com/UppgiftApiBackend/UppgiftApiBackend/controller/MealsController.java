package com.UppgiftApiBackend.UppgiftApiBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UppgiftApiBackend.UppgiftApiBackend.model.meals;
import com.UppgiftApiBackend.UppgiftApiBackend.service.MealsService;

@RestController
public class MealsController {

    private MealsService mealsService;

    @Autowired
    public MealsController(MealsService mealsService) {
        this.mealsService = mealsService;
    }

    @PostMapping("/meal")
    public meals addMeal(@RequestBody meals meal) {
        System.out.println("This meal was added: " + meal);
        return mealsService.addMeal(meal);
    }
    
}

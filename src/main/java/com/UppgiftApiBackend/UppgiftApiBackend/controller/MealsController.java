package com.UppgiftApiBackend.UppgiftApiBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/meal")
    public meals getMeal(@RequestParam Integer id) {
        return mealsService.getMeal(id);
    }

    @GetMapping("/meals")
    public List<meals> getAllMeals() {
        return mealsService.getAllMeals();
    }

    @PostMapping("/meal")
    public meals addMeal(@RequestBody meals meal) {
        System.out.println("This meal was added: " + meal);
        return mealsService.addMeal(meal);
    }

    @DeleteMapping("/delete")
    public meals deleteMeal(@RequestParam Integer id) {
        return mealsService.deleteMeal(id);
    }
    
}

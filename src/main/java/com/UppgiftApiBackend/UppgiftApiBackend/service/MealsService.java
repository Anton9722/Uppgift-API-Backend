package com.UppgiftApiBackend.UppgiftApiBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.UppgiftApiBackend.UppgiftApiBackend.model.meals;
import com.UppgiftApiBackend.UppgiftApiBackend.repository.MealsRepository;

@Service
public class MealsService {
    
    private final MealsRepository mealsRepository;

    @Autowired
    public MealsService(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }

    //GET hämtar en specifik meal från databasen
    public meals getMeal(Integer id) {
        return mealsRepository.findById(id).orElse(null);
    }

    //GET hämtar alla böcker i vår databas
    public List<meals> getAllMeals() {
        return mealsRepository.findAll();
    }

    //POST lägget till en ny meal till databasen
    public meals addMeal(meals meal) {
        mealsRepository.save(meal);
        return meal;
    }

    //DELETE tar bort en meal från vår databas
    public meals deleteMeal(Integer id) {
        meals mealToDelete = getMeal(id);
        if(mealToDelete != null) {
            mealsRepository.deleteById(id);
            return mealToDelete;
        }
        return null;
    }

    //PATCH ändrar en kommentar
    public meals changeComment(Integer id, String comment) {
        try {
            mealsRepository.changeComment(comment, id);
            return getMeal(id);
            
        } catch (Exception e) {
            System.out.println(e + "<-------------");
        }
        return null;
    }
}

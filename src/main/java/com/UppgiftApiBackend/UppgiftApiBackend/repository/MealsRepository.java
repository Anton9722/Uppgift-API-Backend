package com.UppgiftApiBackend.UppgiftApiBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UppgiftApiBackend.UppgiftApiBackend.model.meals;

public interface MealsRepository extends JpaRepository<meals, Integer> {
    
}

package com.UppgiftApiBackend.UppgiftApiBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.UppgiftApiBackend.UppgiftApiBackend.model.meals;

import jakarta.transaction.Transactional;

public interface MealsRepository extends JpaRepository<meals, Integer> {

    @Transactional
    @Modifying
    @Query("update meals m set m.comment = :comment where m.id = :id")
    int changeComment(@Param("comment") String comment, @Param("id") Integer id);
    
}

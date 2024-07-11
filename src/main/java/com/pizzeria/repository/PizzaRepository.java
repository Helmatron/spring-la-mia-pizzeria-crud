package com.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzeria.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}

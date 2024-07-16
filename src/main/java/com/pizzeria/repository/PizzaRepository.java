package com.pizzeria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzeria.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

	/* QUEARY EQUIVALENTE
	 * 
	 * SELECT * 
	 * FROM book b 
	 * WHERE p.name = ?
	 */
	
	public List<Pizza> findByName(String name);

}

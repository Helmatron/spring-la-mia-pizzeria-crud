package com.pizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pizzeria.model.Pizza;
import com.pizzeria.repository.PizzaRepository;

@Controller
@RequestMapping("/")
public class PizzaController {
	
	@Autowired
	private PizzaRepository repository;

	@GetMapping
	public String index(Model model) {
		List<Pizza> pizze = repository.findAll();
		model.addAttribute("list", pizze);
		return "index";
	}

}

package com.pizzeria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/dettagli_pizze/{id}")
	public String findPizzaById(@PathVariable("id") Integer id, Model model) {
		Pizza pizza = repository.getReferenceById(id);
		if (pizza != null) {
			model.addAttribute("pizza", pizza);
			model.addAttribute("findPizzaById", true);
			return "dettagli_pizze";
		} else {

			return "redirect:/";
		}
	}

	@GetMapping("/search")
	public String findPizzaByName(@RequestParam(name = "name", required = false) String name, Model model) {
		List<Pizza> pizze = new ArrayList<>();

		if (name == null || name.isBlank()) {
			pizze = repository.findAll();

		} else {
			pizze = repository.findByName(name);
		}
		model.addAttribute("list", pizze);
		return "index";
	}
}

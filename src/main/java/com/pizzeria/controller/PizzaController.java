package com.pizzeria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/dettagli_pizze/{id}")
	public String findPizzaById(@PathVariable("id") int id, Model model) {
	    Optional<Pizza> optionalPizza = repository.findById(id);
	    if (optionalPizza.isPresent()) {
	        Pizza pizza = optionalPizza.get();
	        model.addAttribute("pizza", pizza);
	        model.addAttribute("findPizzaById", true);
	        return "dettagli_pizze";
	    } else {
	        // Gestione caso in cui la pizza non è trovata (ad esempio, reindirizzamento a una pagina di errore)
	        return "redirect:/";
	    }
	}
}

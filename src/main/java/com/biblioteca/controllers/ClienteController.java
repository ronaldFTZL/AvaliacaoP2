package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.models.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	
	private Cliente cliente;
	
	@GetMapping("clientes")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("Cliente");

		modelAndView.addObject("Livro" , livro.findAll());
		
		modelAndView.addAllObjects("livro" , new Livro());
		
		
		return modelAndView;
		
	}
	

}

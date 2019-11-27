package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.models.Cliente;
import com.biblioteca.repository.Clientes;

@Controller
public class ClienteController {
	
	@Autowired
	
	private Clientes clientes;
	
	@GetMapping("/clientes")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("clientes");

		modelAndView.addObject("cliente" , clientes.findAll());
		
		modelAndView.addObject("cliente", new Cliente());
		
		return modelAndView;
		
	}

}

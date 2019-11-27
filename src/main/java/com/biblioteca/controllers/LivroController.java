package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.models.Livro;
import com.biblioteca.repository.*;

@Controller
public class LivroController {

	@Autowired
	private  LivroRepository livros;

	@PostMapping("/livros")
	public String salvar(Livro livro) {

		this.livros.save(livro);

		return "redirect:/index";
	};

	@GetMapping("/livros")
	public static ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("Livro");

		modelAndView.addObject("livro", livroRepository.findAll());

		modelAndView.addObject("Livro", new Livro());

		return modelAndView;

	}

	public String getLivro(Livro livro) {
		this.livroRepository.Find();

		return "redirect:/detalhes";
	}

	public static boolean removeLivro() {

		return true;
	}

	public static void updateLivro() {

	}

}

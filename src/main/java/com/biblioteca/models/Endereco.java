package com.biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Endereco {

	@Autowired
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@OneToMany
	private String rua;
	private int numero;
	private String cep;
	
}

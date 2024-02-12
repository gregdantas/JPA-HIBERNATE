package br.com.projectJpa.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Categoria {
	
	 @Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
     private Long id ; 
     private String nome ;
     
     
     
	public Categoria( String nome) {
		super();
		this.nome = nome;
	} 
	
	

}

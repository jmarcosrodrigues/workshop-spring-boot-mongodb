package com.joaomarcos.workshopmongo.dto;

import java.io.Serializable;

import com.joaomarcos.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	
	public AuthorDTO() {
		
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		nome = obj.getName();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

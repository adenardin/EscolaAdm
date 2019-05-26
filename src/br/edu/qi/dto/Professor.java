package br.edu.qi.dto;

public class Professor {

	private String nome;
	private Integer id;

	public Professor(String nome, Integer id) {
		this.nome = nome;
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getId() {
		return this.id;
	}

}

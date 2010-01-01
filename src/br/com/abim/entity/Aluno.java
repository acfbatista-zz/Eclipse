package br.com.abim.entity;

public class Pessoa {

	private Long Id;
	private String Nome;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "A pessoa é [Id=" + Id + ", Nome=" + Nome + "]";
	}

}
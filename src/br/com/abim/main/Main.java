package br.com.abim.main;

import br.com.abim.entity.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setId(17L);
		p.setNome("Antonio");
		
		mostrarPessoa(p);
	}
	
	public static void mostrarPessoa(Pessoa p) {
		System.out.println(p.toString());
	}
	
}
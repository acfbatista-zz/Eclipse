package br.com.abim.main;

import br.com.abim.entity.IPessoa;
import br.com.abim.entity.Aluno;

public class Main {
	
	public static void main(String[] args) {
		IPessoa p = new Aluno();
		p.setId(17L);
		p.setNome("Antonio");
		
		exibirPessoa(p);
	}
	
	public static void exibirPessoa(IPessoa p) {
		System.out.println(p.toString());
	}
	
}
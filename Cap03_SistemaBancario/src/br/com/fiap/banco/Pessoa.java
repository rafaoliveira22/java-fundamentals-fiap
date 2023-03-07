package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*encapsulamento do atributo nome, ou seja, 
	 * nenhuma outra classe consegue alterar esse atributo*/
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
} // class Pessoa

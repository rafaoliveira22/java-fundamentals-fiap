package com.java;

public class Conta {
	// ATRIBUTOS
	int numero;
	double saldo;
	
	// construtor padrão
	public Conta() {
		
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/* a clase Conta tem um cliente ou é um cliente? TEM UM CLIENTE, por isso
	 trabalha-se com a referencia do Cliente dentro da classe Conta */
	Cliente cliente = new Cliente();
	
	// MÉTODOS <modificador><tipo de retorno><nomeDoMetodo>(<lista de argumentos>){instrucoes}
	public double recuperarSaldo(){
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
} // Conta{}

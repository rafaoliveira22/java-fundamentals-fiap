package com.java;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaPoupanca.numero = 20;
		contaPoupanca.saldo = 110.8;
		contaPoupanca.cliente.nome = "Daniel";
		contaPoupanca.cliente.idade = 55;
		
		contaInvestimento.numero = 300;
		contaInvestimento.saldo = 522.0;
		contaInvestimento.cliente.nome = "Marcia";
		contaInvestimento.cliente.idade = 51;
		
		
		Conta cc = new Conta(100, 536.9);
		System.out.println(cc.numero);
		System.out.println(cc.recuperarSaldo());
	} // main
} // TesteConta{}

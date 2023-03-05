package br.com.fiap.banco;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new Conta();
		cc.saldo = 178.2;
		cc.agencia = 123;
		cc.numero = 456;
		cc.depositar(1000);
		System.out.println("Saldo atual na conta corrente: " + cc.verificarSaldo());
		
		
		Conta poupanca = new Conta(123, 321, 583.52);
		poupanca.retirar(500);
		System.out.println("Saldo atual na conta poopança: " + poupanca.verificarSaldo());
		
		
		Conta cc2 = null;
		if(cc2 != null) System.out.println("Existe uma conta");
		else System.out.println("Invalido. Objeto nao criado");
	}
} // TesteConta{}

package br.com.fiap.banco;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new Conta();
		cc.depositar(178.2);
		cc.setAgencia(124);
		cc.setNumero(456);
		System.out.println("Saldo atual na conta corrente: " + cc.getSaldo());
		
		
		Conta poupanca = new Conta(123, 321, 583.52);
		poupanca.retirar(500);
		System.out.println("Saldo atual na conta poopança: " + poupanca.getSaldo());
		
		
		Conta cc2 = null;
		if(cc2 != null) System.out.println("Existe uma conta");
		else System.out.println("Invalido. Objeto nao criado");
	}
} // TesteConta{}

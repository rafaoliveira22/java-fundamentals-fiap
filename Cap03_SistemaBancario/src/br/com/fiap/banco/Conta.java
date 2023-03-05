package br.com.fiap.banco;

/**
 * Classe que abstrai uma conta bancária
 * @author Rafael Oliveira
 * @version 1.0
 * */
public class Conta {
	/**
	 * número da agencia da conta
	 * */
	int agencia;
	
	/**
	 * número da conta
	 * */
	int numero;
	
	/**
	 * saldo atual da conta
	 * */
	double saldo;
	
	public Conta(){/*construtor padrãp*/}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * deposita um valor na conta
	 * @param valor Valor a ser depositado
	 * */
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	/**
	 * retira um valor na conta
	 * @param valor Valor a ser retirado
	 * */
	public void retirar(double valor){
		this.saldo -= valor;
	}
	
	/**
	 * verificado o saldo atual da conta
	 * @return Retona o saldo atual da conta
	 * */
	public double verificarSaldo(){
		return this.saldo;
	}
	
}

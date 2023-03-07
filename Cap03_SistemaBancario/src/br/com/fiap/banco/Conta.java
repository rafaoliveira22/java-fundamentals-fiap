package br.com.fiap.banco;

import java.io.Serializable;


/**
 * Classe que abstrai uma conta bancária
 * @author Rafael Oliveira
 * @version 1.0
 * */
public class Conta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * número da agencia da conta
	 * */
	private int agencia;
	
	/**
	 * número da conta
	 * */
	private int numero;
	
	/**
	 * saldo atual da conta
	 * */
	private double saldo;
	
	public Conta(){/*construtor padrãp*/}
	
	public Conta(int agencia, int numero, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
	/** 
	 * Getters e Setters
	 * */
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	public double getSaldo(){
		return this.saldo;
	}
	
	
	
	
	
}

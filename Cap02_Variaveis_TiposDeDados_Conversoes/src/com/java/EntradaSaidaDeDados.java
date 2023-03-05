package com.java;
import java.util.Scanner;

public class EntradaSaidaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("VERIFICADO NUM PAR OU IMPAR\n");
		System.out.println("DIGITE UM NUMERO: ");
		int numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println("O NUMERO " + numero + " EH PAR");
		} else {
			System.out.println("O NUMERO " + numero + " EH IMPAR");
		} // IF
	} // main
} // EntradaSaidaDeDados
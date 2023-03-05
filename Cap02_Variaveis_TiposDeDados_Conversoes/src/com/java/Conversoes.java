package com.java;

public class Conversoes {
	public static void main(String[] args) {
		// conversões automáticas
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		System.out.println("x= " + x + " d= " + d + " l= " + l + " f= " + f);
		
		// cast
		double a = 10.43432;
		int b = (int) a;
		System.out.println(b); // 10
	}

}

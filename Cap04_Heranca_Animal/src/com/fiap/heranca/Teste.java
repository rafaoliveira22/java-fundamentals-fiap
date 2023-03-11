package com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		animal.setAlimenta("Cachorro come ração de cachorro");
		animal.setLocomove("Cachorro usa suas 4 patas");
		cachorro.setLatido("Cachorro faz au au");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Cachorro come ração de cachorro");
		poodle.setLocomove("Cachorro usa suas 4 patas");
		/*Nesse caso, o latido fica inacessivel, pois a referencia poodle é
		 * da superclasse Animal*/
	}

}

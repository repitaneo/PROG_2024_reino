package main;

import animales.Animal;
import animales.Gamusino;
import minerales.Diamante;
import vegetales.Roble;
import vegetales.Vegetal;

public class Start {

	public static void main(String[] args) {
		
		/*
		Roble carbayon = new Roble("Carbayon",20,false,Vegetal.VEGETAL_ARBOL,10);
		System.out.println(carbayon);
		
		Gamusino gamuza = new Gamusino("Gamuza", 1, Animal.ANIMAL_VIVIPARO, -3000, false);
		System.out.println(gamuza);
		 */
		
		Diamante diamante = new Diamante("Diamante", 1, 10, 100);
		System.out.println(diamante);
	}

}

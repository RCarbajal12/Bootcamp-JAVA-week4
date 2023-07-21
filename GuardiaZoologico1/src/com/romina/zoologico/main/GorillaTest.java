package com.romina.zoologico.main;

import com.romina.zoologico.objects.Gorilla;

public class GorillaTest {
	
	public static void main(String[] args) {
		
		//NUEVO OBJETO
		Gorilla kong = new Gorilla();
		
		//EJECUTANDO MÉTODO DE ENERGÍA INICIAL
		System.out.print("Energia inicial: ");
		kong.displayEnergy();
		
		//EJECUTANDO MÉTODO DE LANZAR ALGO
		for (int idx = 0; idx < 3; idx++) {
			kong.throwSomething();
		}
		System.out.print("Energia después de lanzar: ");
		kong.displayEnergy();
		
		//EJECUTANDO MÉTODO DE COMER BANANAS
		kong.eatBananas();
		kong.eatBananas();
		System.out.print("Energia después de comer bananas: ");
		kong.displayEnergy();
		
		//EJECUTANDO MÉTODO DE TREPAR
		kong.climb();
		System.out.print("Energia despues de trepar a la cima de un árbol: ");
		kong.displayEnergy();
		
	}


}

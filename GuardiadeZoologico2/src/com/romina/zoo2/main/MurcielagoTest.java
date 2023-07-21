package com.romina.zoo2.main;

import com.romina.zoo2.clases.Murcielago;

public class MurcielagoTest {
	
	public static void main(String [] args) {
		//NUEVO OBJETO
		Murcielago bat = new Murcielago();
		
		//MOSTRANDO ENERGÍA INICIAL
		System.out.print("Energia inicial: ");
		bat.displayEnergy();
		
		//EJECUTANDO MÉTODO DE VOLAR
		System.out.println("*Sonido de despegue*");
		bat.fly();
		System.out.print("Energia después de volar: ");
		bat.displayEnergy();
		
		//EJECUTANDO MÉTODO DE ATACAR A LA CIUDAD
		System.out.println("*Sonido de la ciudad en llamas*");
		bat.attackTown();
		System.out.print("Energia despues de atacar la ciudad: ");
		bat.displayEnergy();
		
		//EJECUTANDO MÉTODO DE COMER HUMANOS
		System.out.println("Bueno, no importa...");
		bat.eatHumans();
		System.out.print("Energia despues de comer humanos: ");
		bat.displayEnergy();
		
		
	}

}

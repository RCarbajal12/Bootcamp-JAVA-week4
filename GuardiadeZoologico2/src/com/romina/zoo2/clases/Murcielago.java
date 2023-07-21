package com.romina.zoo2.clases;

import com.romina.zoologico.objects.Mamifero;

public class Murcielago extends Mamifero{
	
	//CONSTRUCTOR
	public Murcielago() {
		this.setEnergia(300);
	}
	
	//MÉTODOS
	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel()-50);
		}
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}


}

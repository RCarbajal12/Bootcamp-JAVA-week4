package com.romina.zoologico.objects;

public class Mamifero {

	private int energyLevel;
	
	//CONSTRUCTOR
	
	public Mamifero() {
		this.energyLevel =100;
	}
	
	//MÉTODO

	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}

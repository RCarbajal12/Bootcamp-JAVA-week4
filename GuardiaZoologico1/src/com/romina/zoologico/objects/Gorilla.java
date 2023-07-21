package com.romina.zoologico.objects;

public class Gorilla extends Mamifero{
	
	//MÉTODOS
	public void throwSomething() {
		this.getEnergyLevel();
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		this.setEnergyLevel(getEnergyLevel()+10);
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel()-10);
	}

}

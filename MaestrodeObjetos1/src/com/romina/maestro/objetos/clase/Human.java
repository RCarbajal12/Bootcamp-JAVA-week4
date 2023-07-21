package com.romina.maestro.objetos.clase;

public class Human {
	
	//PROPIEDADES
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	private String clase = "Human";
	private String nombre = "";
	private boolean vida = true;
	
	
	//CONSTRUCTORES
	public Human() {

	}
	
	public Human(int strenght, int intelligence, int stealth, int health, String nombre, String clase){
		this.strength = strenght;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
		this.nombre = nombre;
		this.clase = clase;
	}
	
	//MÉTODO PARA ATACAR A OTRO HUMANO
	 public void attack(Human victima) {
	            System.out.println(this.nombre + " ha atacado a " + victima.nombre);
	            System.out.println(victima.nombre + " perdió " + this.strength + " puntos de vida");
	            victima.setHealth(-this.strength);

	    }

	//GETTERS Y SETTERS
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength += strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence += intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth += stealth;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health += health;
		
	}
	public String getClase() {
		return clase;
	}
	
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVida() {
		return vida;
	}

	public void setVida(boolean vida) {
		this.vida = vida;
	}

}

package com.romina.cuentabanco.clases;

import java.util.Random;

public class BankAccount {
	//ATRIBUTOS
	private String numeroDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaDeAhorros;
	private Object saldoCuentaAhorro;
	
	private static int cuentasCreadas = 0;
	private static double rastreo = 0;
	
	//CONSTRUCTORES
	public BankAccount() {
		this.numeroDeCuenta = generarNroAleatorio();
		cuentasCreadas++;
		
	}
	
	public BankAccount( double saldoCuentaCorriente, double saldoCuentaDeAhorros) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaDeAhorros = saldoCuentaDeAhorros;
		rastreo += saldoCuentaCorriente + saldoCuentaDeAhorros;
	}


	//MÉTODO PARA GENERAR NÚMERO ALEATORIO DE CUENTA
	private String generarNroAleatorio() {
		Random nroRandom = new Random();
		StringBuilder string = new StringBuilder();
		int i=0;
		while (i < 10) {
			int digito = nroRandom.nextInt(10);
			string.append(digito);
			i++;
			}
		return string.toString();
	}
	
	//MÉTODO PARA DEPOSITAR DINERO EN LA CUENTA CORRIENTE O CUNTA DE AHORROS
	public void depositar(double monto, boolean estáAhorrando) {
		if(estáAhorrando) {
			saldoCuentaDeAhorros += monto;
		}
		else {
			saldoCuentaCorriente += monto;
		}
		rastreo += monto;
	}
	
	//MÉTODO PARA REITRAR DINERO DE UNA CUENTA
	public void retirarDinero(double monto, boolean estáAhorrando) {
		if(estáAhorrando) {
			if(monto <= saldoCuentaDeAhorros) {
				saldoCuentaDeAhorros -= monto;
				rastreo -= monto;
			}
			else {
				System.out.println("Fondos insuficientes en la cuenta de ahorros para retirar.");
			}
		}
		else {
			if(monto <= saldoCuentaCorriente) {
				saldoCuentaCorriente -= monto;
				rastreo -= monto;
			}
			else {
				System.out.println("Fondos insuficientes en la cuenta corriente para retirar.");
			}
		}
	}
	
	//MÉTODO PARA VER EL TOTAL DE DINERO DE LA CUENTA CORRIENTE Y CUENTA DE AHORROS
	public void verDineroTotal() {
		System.out.println("Saldo cuenta corriente: " + saldoCuentaCorriente);
		System.out.println("Saldo cuenta de ahorros: " + saldoCuentaDeAhorros);
	}
	
	//GETTERS Y SETTERS
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldoCuentaCorriente() {
		System.out.printf("Saldo CC: %.2f", saldoCuentaCorriente);
		System.out.println();		
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		System.out.printf("Saldo CA: %.2f", saldoCuentaAhorro);
		System.out.println();	
		return saldoCuentaDeAhorros;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaDeAhorros = saldoCuentaAhorro;
	}

	public static int getCuentasCreadas() {
		return cuentasCreadas;
	}

	public static void setCuentasCreadas(int cuentasCreadas) {
		BankAccount.cuentasCreadas = cuentasCreadas;
	}

	public static double getRastreo() {
		return rastreo;
	}

	public static void setRastreo(double rastreo) {
		BankAccount.rastreo = rastreo;
	}

	public double getSaldoCuentaDeAhorros() {
		return saldoCuentaDeAhorros;
	}

	public void setSaldoCuentaDeAhorros(double saldoCuentaDeAhorros) {
		this.saldoCuentaDeAhorros = saldoCuentaDeAhorros;
	}

}

package com.romina.cuentabanco.main;

import com.romina.cuentabanco.clases.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		    BankAccount cuenta01 = new BankAccount();
	        BankAccount cuenta02 = new BankAccount();
	        
	        //EJECUTANDO MÉTODO DE GENERAR CUENTA CORRIENTE
	        System.out.println("Número de cuenta 01: " + cuenta01.getNumeroDeCuenta());
	        System.out.println("Número de cuenta 02: " + cuenta02.getNumeroDeCuenta());

	        // EJECUNTADO MÉTODO PARA DEPOSITAR DINERO
	        cuenta01.depositar(1000, false); 
	        cuenta01.depositar(500, true); 
	        cuenta02.depositar(2000, false); 
	        
	        //EJECUTANDO MÉTODO PARA VER EL DINERO TOTAL DE LAS CUENTAS
	        System.out.print("Cuenta 1: ");
	        cuenta01.verDineroTotal();
	        System.out.print("Cuenta 2: ");
	        cuenta02.verDineroTotal();

	        // EJECCUTANDO MÉTODO PARA RETIRAR DINERO
	        cuenta01.retirarDinero(200, false); 
	        cuenta02.retirarDinero(100, true);  

	        // VER DINERO TOTAL DE LAS CUENTAS
	        System.out.print("Cuenta 1:");
	        cuenta01.verDineroTotal();
	        System.out.print("Cuenta 2:");
	        cuenta02.verDineroTotal();

	        // VER NÚMERO DE CUENTAS CREADAS Y DINERO TOTAL RASTREADO
	        System.out.println("Número de cuentas creadas: " + BankAccount.getCuentasCreadas());
	        System.out.println("Total de dinero almacenado: " + BankAccount.getRastreo());
	    }

}

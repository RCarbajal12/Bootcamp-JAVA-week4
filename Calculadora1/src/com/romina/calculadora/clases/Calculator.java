package com.romina.calculadora.clases;

public class Calculator {
	//ATRIBUTOS
    private double operandOne;
    private double operandTwo;
    private char operation;
    private double result;

    public Calculator() {
      
    }
   //MÉTODO PARA LLEVAR A CABO LA OPERACIÓN
    public void performOperation() {
        if (operation == '+') {
            result = operandOne + operandTwo;
        } else if (operation == '-') {
            result = operandOne - operandTwo;
        } else {
            System.out.println("Operación no válida");
        }
    }

    //GETTERS Y SETTERS
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

    
}

package com.romina.calculadora.main;
import com.romina.calculadora.clases.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
    	//OBJETO
        Calculator calculator = new Calculator();
        //EJECUTANDO MÈTODOS
        calculator.setOperandOne(10.5);
        calculator.setOperation('+');
        calculator.setOperandTwo(5.2);

        calculator.performOperation();
        double result = calculator.getResult();

        System.out.println("El resultado es: " + result); 
    }
}

package com.romina.calculadora.main;
import com.romina.calculadora.clases.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.setOperandOne(10.0);
        calculator.setOperation('+');
        calculator.setOperandTwo(5.7);

        calculator.performOperation();
        double result = calculator.getResult();

        System.out.println("El resultado es: " + result); 
    }
}

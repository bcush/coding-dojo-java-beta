package com.codingdojo.calculatorpartone;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calcTest = new Calculator();
		calcTest.setOperandOne(10.5);
		calcTest.setOperandTwo(5.2);
		calcTest.setOperation('+');
		calcTest.performOperation();
		System.out.println(calcTest.getResults());
	}

}

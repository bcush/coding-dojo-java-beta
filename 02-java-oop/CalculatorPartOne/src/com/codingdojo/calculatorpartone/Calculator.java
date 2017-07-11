package com.codingdojo.calculatorpartone;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
	private static double result = 0;
	private double operandOne = 0;
	private double operandTwo = 0;
	private char operation;
	
	public Calculator() {
	}
	
	public void setOperandOne(double d) {
		this.operandOne = d;
	}
	
	public void setOperandTwo(double d) {
		this.operandTwo = d;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if (this.operation == '+') {
			this.result = (this.operandOne + this.operandTwo);
		}
		
		if (this.operation == '-') {
			this.result = (this.operandOne - this.operandTwo);
		}
	}
	
	public static double getResults() {
		return result;
	}
	
	public void setresults(double result) {
		this.result = result;
	}
}

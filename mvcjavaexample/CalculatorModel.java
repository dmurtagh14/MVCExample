package com.mvcjavaexample;

public class CalculatorModel {
	
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		
		calculationValue = firstNumber + secondNumber;
		
	}
	
	public int getCalcValue() {
		return calculationValue;
	}

}

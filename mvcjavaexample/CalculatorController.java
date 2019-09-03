package com.mvcjavaexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	
	private CalculatorView theView;
	
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalcutionListener(new CalculateListener());
	}
	
	//inner class
	class CalculateListener implements ActionListener{
		//where all interaction occurs
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			//see if the user enters a number
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				//actual calculations happen here
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalcValue());

			}
			
			catch(NumberFormatException ex) {
				theView.displyErrorMessage("You need to enter 2 integers");
			}
			
		}
		
	}
	
	
}

package it.A3;

public class calcuimplementation {

	calcinterface calc;
	

	
	public void setCalc(calcinterface calc) {
		this.calc = calc;
	}



	public int  addTwoNums (int a, int b) {
		return calc.add(a,b);
	}
	
	public int subtractTwoNums (int a , int b) {
		return calc.subtract(a, b);
	}
	
	public int multiplyTwoNums(int a , int b) {
		
		return calc.multiply (a, b);
	}
	
	public int divideTwoNums(int a , int b) {
		return calc.divide(a, b);
	}
	
	
}


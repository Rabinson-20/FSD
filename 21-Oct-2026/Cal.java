package oops;

public class Cal {
	public static void main(String[] args) {

		Calculator c=new Calculator();
		c.addition(15, 20);
		c.addition(30, 20, 50);
		c.addition(10,10.5,20);
	}
}

class Calculator{
	void addition(int a, int b){
		System.out.println("Output from 1st method : "+(a+b));
	}
	void addition(int a, int b, int c){
		System.out.println("Output from 2st method : "+(a+b+c));
	}
	void addition(int a, double b, int c){
		System.out.println("Output from 3st method : "+(a+b+c));
	}
}
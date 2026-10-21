package oops;

public class Inheritance1 {
	public static void main(String[] args) {
		daughter2 d2= new daughter2();
		d2.motorcycle();
		System.out.println(d2.sbi);
	}
}

class Mother{
	int sbi=100000;
	void motorcycle(){
		System.out.println("Getting scooter from father class");
	}
}

class daughter1 extends Mother{
	int hdfc=1000;
	void cycle(){
		System.out.println("Cycle got from daughter class");
	}
}

class daughter2 extends Mother{
	int sbi=1000;
	void motorcycle(){
		System.out.println("Motor Cycle got from daughter2 class");
		super.motorcycle();
		System.out.println(super.sbi);
	}
}
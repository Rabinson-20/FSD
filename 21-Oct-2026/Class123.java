package oops;

public class Class123 {
	public static void main(String[] args) {
		Father f=new Father();
		f.bike();
		f.car();
		
		Son s=new Son();
		s.cycle();
	}
}

class Father{
	int sbi=100000;

	void bike(){
		System.out.println("Honda Bike by Father");
	}
	void car(){
		System.out.println("Maruti Car by Father");
	}
}

class Son extends Father{
	int hdfc=100;
	void cycle(){
		System.out.println("Cycle from son's class");
	}
}



package oops;

public class Inheritance {
	public static void main(String[] args) {
		Father1 f1= new Father1();
		f1.bike();
		
		Son1 s1= new Son1();
		s1.bike();
		s1.cycle();
		
		Son2 s2= new Son2();
		s2.bike();
		s2.newcycle();
	}

}

class Father1{
	int sbi=100000;
	void bike(){
		System.out.println("Getting bike from father class");
	}
}

class Son1 extends Father1{
	int hdfc=1000;
	void cycle(){
		System.out.println("Cycle got from Son class");
	}
}

class Son2 extends Father1{
	int hdfc=1000;
	void newcycle(){
		System.out.println("New Cycle got from Son2 class");
	}
}
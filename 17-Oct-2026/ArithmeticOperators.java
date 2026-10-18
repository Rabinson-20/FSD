package fundamentals;
import java.util.Scanner;
public class ArithmeticOperators {
	public static void main(String[] args) {
		Arithmetic a=new Arithmetic();
		a.add();
		a.sub();
		a.mul();
		a.mod();
		a.div();
	}
}
class Arithmetic{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	int b=sc.nextInt();
	public void add(){
		int add=a+b;
		System.out.println("Sum : "+add);
	}
	public void sub(){
		int sub=a-b;
		System.out.println("Difference : "+sub);
	}
	public void mul(){
		int mul=a*b;
		System.out.println("Product : "+mul);
	}
	public void mod(){
		int mod=a%b;
		System.out.println("Remainder : "+mod);
	}
	public void div(){
		int div=a/b;
		System.out.println("Qutient : "+div);
	}
}
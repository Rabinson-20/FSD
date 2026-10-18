package fundamentals;
import java.util.Scanner;
public class LogicalOperators {
	public static void main(String[] args) {
		Logical l=new Logical();
		l.andOp();
		l.orOp();
		l.notOp();
	}
}
class Logical{
	Scanner sc=new Scanner(System.in);
	
	public void andOp(){
		int age = sc.nextInt();
		int mark = sc.nextInt();
		boolean eligible = (age >= 18) && (mark > 50);
		System.out.println("Eligible : "+ eligible);
	}
	public void orOp(){
		int age=sc.nextInt();
		boolean getDiscount = (age<12) || (age>60);
		System.out.println("Gets Discount: "+ getDiscount);
	}
	public void notOp(){
		boolean isBlocked = sc.nextBoolean();
		boolean canAccess = !isBlocked;
		System.out.println("Access granted: "+ canAccess);
	}
}
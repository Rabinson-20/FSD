package fundamentals;
import java.util.Scanner;

public class SwitchArithmatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value : ");
		int a=sc.nextInt();
		System.out.println("Enter B value : ");
		int b=sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Operation : '+' is Addition");
		System.out.println("Operation : '-' is Subraction");
		System.out.println("Operation: '*' is Multiplication");
		System.out.println("Operation: '%' is Modulus");
		System.out.println("Operation: '/' is Division");
		System.out.println("--------------------");
		System.out.println("Enter value operation:");
		char op=sc.next().charAt(0);
		switch(op){
		case '+':
			int c=a+b;
			System.out.println("Addition value is: "+c);
			break;
		case '-':
			int d=a-b;
			System.out.println("Subtraction value is: "+d);
			break;
		case '*':
			int e=a*b;
			System.out.println("Multiplication value is: "+e);
			break;
		case '%':
			int f=a%b;
			System.out.println("Modulus value is: "+f);
			break;
		case '/':
			int g=a/b;
			System.out.println("Division value is: "+g);
			break;
		default:
			System.out.println("Enter valid input");
			break;
		}
	}
}
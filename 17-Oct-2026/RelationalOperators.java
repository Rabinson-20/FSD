package fundamentals;
import java.util.Scanner;
public class RelationalOperators {
	public static void main(String[] args) {
		Relational r = new Relational();
		r.compare();
	}
}
class Relational{
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	public void compare(){
		System.out.println(a+" > "+b+" : "+(a>b));
		System.out.println(a+" < "+b+" : "+(a<b));
		System.out.println(a+" == "+b+" : "+(a==b));
		System.out.println(a+" != "+b+" : "+(a!=b));
	}
}
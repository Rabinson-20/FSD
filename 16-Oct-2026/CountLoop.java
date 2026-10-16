package fundamentals;
import java.util.Scanner;

public class CountLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int count=0;
		for(int i=a; i>0; i/=10){
			count++;
		}
		if(a==0){
			count=1;
		}
		System.out.println("The count digit is:"+count);
	}
}
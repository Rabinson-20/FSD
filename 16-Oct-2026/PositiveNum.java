package fundamentals;
import java.util.Scanner;
public class PositiveNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		if(num>=0){
			System.out.println("The number is Positive.");
		}
		else{
			System.out.println("The number is Negative.");
		}
	}

}

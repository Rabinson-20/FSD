package Oct26;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum=Arrays.stream(arr).sum();
		System.out.println("Sum: "+sum);
	}

}

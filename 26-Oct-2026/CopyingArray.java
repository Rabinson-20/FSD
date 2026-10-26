package Oct26;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};

        int[] copy = Arrays.copyOf(arr, 3);	
        System.out.println(Arrays.toString(copy));
	}

}

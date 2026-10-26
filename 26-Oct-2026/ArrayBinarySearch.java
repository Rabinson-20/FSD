package Oct26;
import java.util.Arrays;
public class ArrayBinarySearch {

	public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(arr, 30);

        System.out.println("Index: " + index);
    }
}
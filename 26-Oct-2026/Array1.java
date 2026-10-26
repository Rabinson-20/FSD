package Oct26;

import java.util.Arrays;
import java.util.ArrayList;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
public class Array1 {

	public static void main(String[] args) {
		// Normal array
		int arr[]= new int[10];
		arr[0]=100;
		System.out.println(arr[0]);
		
		//1.Array in integer and string
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString(intArray);
		
		System.out.println(intArray);
		 
		System.out.println(intArrayString);

		//2.ArrayList
		String[] stringArray = { "a", "b", "c", "d", "e" };

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));

		System.out.println(arrayList);
		
		//3.Check if an array contains a certain value
		String[] strArray = { "abc", "bcd", "cba", "dcb", "efg" };

		boolean b = Arrays.asList(strArray).contains("abc");
		System.out.println(b);

		//4.Concatenate two arrays
		int[] intArray1 = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		
		//5.Apache Commons Lang library
		int a[] = ArrayUtils.addAll(intArray1, intArray2);

		String s = Arrays.toString(a);

		System.out.println(s);
		
		//6.Joins the elements of the provided array into a single String
		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
		System.out.println(j);
		
		//9.Reverse an array
		//int[] intArray = { 1, 2, 3, 4, 5 };
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));

		//10. Remove element of an array
		//int[] intArray = { 1, 2, 3, 4, 5 };
		int[] removed = ArrayUtils.removeElement(intArray, 3);
		System.out.println(Arrays.toString(removed));
	}
}
package Oct28;

public class TypesOfException {

	public static void main(String[] args) {
		// Auto-generated method stub
		try{
			int a=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception: Infinite value ");
		}
		try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Exception: Null value");
        }

        try {
            int n = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Exception: Changes of string to number");
        }

        try {
            int arr[] = new int[5];
            arr[10] = 50;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Invalid index");
        }

        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Exception: Invalid index position");
        }

        System.out.println("Rest of the code");
	}

}
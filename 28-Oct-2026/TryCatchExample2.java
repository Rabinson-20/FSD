package Oct28;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=50/0; //may throw exception
		}
		//handling the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}
}
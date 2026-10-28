package Oct28;

public class TryCatchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=50/0; //may throw exception
		}
		// handling the exception
		catch(Exception e)
		{
			// displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}
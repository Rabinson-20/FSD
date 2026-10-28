package Oct28;

public class TryCatchExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50;
		int j=0;
		int data;
		try
		{
			data=i/j; //may throw exception
		}
		// handling the exception
		catch(Exception e)
		{
			// resolving the exception in catch block
			System.out.println(i/(j+2));
		}
	}
}
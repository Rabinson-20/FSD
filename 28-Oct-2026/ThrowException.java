package Oct28;

public class ThrowException {
	public void validate(int age){
		if(age<18){
			throw new ArithmeticException("Not Valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		ThrowException a= new ThrowException();
		a.validate(25);
		System.out.println("Rest of the code");
	}
}
package fundamentals;

public class AssignmentOperators {

	public static void main(String[] args) {
		BankBalance bb = new BankBalance();
		bb.updateBalance();
	}
}
class BankBalance{
	int balance=5000;
	public void updateBalance(){
		System.out.println("Initial Balance : "+ balance);
		balance +=1500;
		System.out.println("After Deposit : "+balance);
		balance -=1000;
		System.out.println("After Withdrawal : "+balance);
	}
}
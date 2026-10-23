package Oct23;

public class Abstract {
	public static void main(String args[]){
		

	}
}

abstract class RBI{
	private final void deposit(){
		System.out.println("Deposit method");
	}
	private final void withdrawal(){
		System.out.println("withdr method");
	}
	
	abstract void educationLoan(); //unimple or abstract
	
	abstract void agriLoan();
	
}

class SBI extends RBI{
	
	void carLoan(){
		System.out.println("ROI 11.25%");
	}
	void housingLoan(){
		System.out.println("ROI 13.25%");
	}
	
	void educationLoan() {
		System.out.println("9%");
		
	}
	
	void agriLoan() {	
	}	
}

interface RTO{
	void BS6();
	void DualDiscBreaks();
	void AirBags();
}

class HondaCity implements RTO{
	
	void RootsHorn(){
		
	}
	void SonyMediaPlayer(){
		
	}
	@Override
	public void BS6() {
	// TODO Auto-generated method stub
	
	}
	@Override
	public void DualDiscBreaks() {
	// TODO Auto-generated method stub
	
	}
	@Override
	public void AirBags() {
	// TODO Auto-generated method stub
	
	}
}
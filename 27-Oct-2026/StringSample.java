package Oct27;

public class StringSample {

	public static void main(String[] args) {
		
		String s="Sam";   //1011
		String f="Sam";
		System.out.println(s.equals(f));
		
		//s.concat("Rabins");     //Pool, Immutable
		System.out.println(s);
		
		//String buffer
		StringBuffer sb=new StringBuffer("Rabin");
		StringBuffer sb1=new StringBuffer("Rabin");
		StringBuilder sb2=new StringBuilder("Rabin");
		
		sb.append("son");
		System.out.println(sb);
		System.out.println(sb.equals(sb1));
		
	}

}
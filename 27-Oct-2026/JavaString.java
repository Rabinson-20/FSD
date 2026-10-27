package Oct27;

public class JavaString {

	public static void main(String[] args) {
		//JavaString
		String s1="java";//creating string by java string literal

		char ch[]={'s','t','r','i','n','g','s'};

		String s2=new String(ch);//converting char array to string

		String s3=new String("example");//creating java string by new keyword

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3); 
		
		
		//Upper-Lower
		String s="Sachin is a Cricket player";  
		
		System.out.println(s.toUpperCase());  
		System.out.println(s.toLowerCase());

		//Trim()
		System.out.println(s.trim());

		//Starting-ending
		System.out.println(s.startsWith("Sa")); 
		System.out.println(s.endsWith("N"));

		//Finding character
		System.out.println(s.charAt(0)); 
		System.out.println(s.charAt(3));

		//Length()
		System.out.println(s.length());
		
		//intern()
		String s4=s.intern();  

		System.out.println(s4);
		
		//ValueOf
		int a=10;  
		String c=String.valueOf(a);  
		System.out.println(c+10);  
		
		//replace
		String s5="Java is a programming language. Java is a platform. Java is an Object oriented and simple language";    
		String replaceString=s5.replace("Java","Python");   
		System.out.println(replaceString);    

		//Concatenation Operator(+)
		String b="Sachin"+" Tendulkar";  
		System.out.println(b);
		
		//Concat
		String a1="Sachin ";  
		String a2="Tendulkar";  
	    String a3=s1.concat(s2);  
	    System.out.println(a3);

		//Equals()
	    String b1="Sachin";  
		String b2=new String("Sachin");  
	    String b3="Saurav";  
		   
		System.out.println(b1.equals(b2));
	    System.out.println(b1.equals(b3)); 

		//Equal Operator(==)
	    System.out.println(b1==b2); 
	    System.out.println(b1==b3);

	    //CompareTo()
	    System.out.println(b1.compareTo(b2)); 
	    System.out.println(b1.compareTo(b3));  
	    System.out.println(b3.compareTo(b1));

	    //Replace All()
	    String replace=s5.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
	    System.out.println(replace);  
	    
	    //Split()
	    String[] words=s5.split("\\s");
	    for(String w:words){  
	    	System.out.println(w);  
	    }  

	    //Splitting 2
	    System.out.println("returning words:");  
	    for(String w:s1.split("\\s",0)){  
	    System.out.println(w);  
	    }  
	    System.out.println("returning words:");  
	    for(String w:s1.split("\\s",1)){  
	    System.out.println(w);  
	    }  
	    System.out.println("returning words:");  
	    for(String w:s1.split("\\s",2)){  
	    System.out.println(w);  
	    }  
	}
}
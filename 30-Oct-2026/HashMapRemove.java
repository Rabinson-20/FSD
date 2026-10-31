package Oct30;

import java.util.*;  
public class HashMapRemove {  
	   public static void main(String args[]) {  
	    HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Sam");    
	      map.put(101,"Rabinson");    
	      map.put(102,"Zameer");  
	      map.put(103, "Shiyam");  
	    System.out.println("Initial list of elements: "+map);  
	    //key-based removal  
	    map.remove(100);  
	    System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(102, "Zameer");  
	    System.out.println("Updated list of elements: "+map);  
	   }      
}
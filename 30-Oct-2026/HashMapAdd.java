package Oct30;
import java.util.*;  
public class HashMapAdd{  
	 public static void main(String args[]){  
	 HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Sam");    
	      hm.put(101,"Rabinson");    
	      hm.put(102,"Zameer");   
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(103, "Shiyam");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
          for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	 }  
}
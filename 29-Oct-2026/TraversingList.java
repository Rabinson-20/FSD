package Oct29;
import java.util.*;
import java.util.ArrayList;

public class TraversingList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
         
        System.out.println("Traversing list through List Iterator:");  
          
        ListIterator<String> list1=list.listIterator(list.size());  

        while(list1.hasPrevious())  
        {  
            String str=list1.previous();  
            System.out.println(str);  
        }  


        System.out.println("Traversing list through for loop:");  
        for(int i=0;i<list.size();i++)  
        {  
        	System.out.println(list.get(i));     
        }  
           

        Iterator<String> i= list.iterator ();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }


	    System.out.println("Traversing list through forEach() method:");  
     
        list.forEach(a->{ 
             System.out.println(a);  
        });  
             

        System.out.println("Traversing list through forEachRemaining() method:");  
        Iterator<String> itr=list.iterator();  
        itr.forEachRemaining(a->{
        	System.out.println(a);  
        });  
	}  
}  


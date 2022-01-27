package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class collections {
	public static void main(String[] args)
	{
		//arraylist
		System.out.println(" ");
		System.out.println("Arraylist");
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Datta");
		a1.add("Sai");
		a1.add("Vinay");
	   Iterator<String> a2 = a1.iterator();
		 for(String s:a1)
		 {
			 System.out.println(s);
		 }
		 
		 //listedlist
		 System.out.println(" ");
		 System.out.println("linkedlist");
		
		 LinkedList l1 = new LinkedList();
		  l1.add(10);
		  l1.add(20);
		  l1.add(30);
		  l1.add(40);
          Iterator s1 = l1.iterator();
          while(s1.hasNext())
          {
        	  System.out.println(s1.next());
          }
          //vector
          
          System.out.println("vector");
           Vector v1 = new Vector();
           v1.add(10.1);
           v1.add(10.2);
           v1.add(10.3);
           v1.add(10.4);
           System.out.println(v1);
           //hashset
           System.out.println(" ");
           System.out.println("hashset");
           
           HashSet h1 = new HashSet();
             h1.add(200);
             h1.add(300);
             h1.add(400);
             for(Object h2:h1)
             {
            	System.out.println(h2); 
             }
	}

}

package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String[] args)
	{
           HashMap m1 = new HashMap();
           m1.put(10, "vinay");
           m1.put(20, "sai");
           m1.put(30, "Datta");
              Set s1 = m1.entrySet();  
             Iterator s2 = s1.iterator();
             while(s2.hasNext())
             {
            	 Map.Entry entry=(Map.Entry)s2.next(); 
            	 System.out.println(entry.getKey()+ " " +entry.getValue());             }
           
	}

}

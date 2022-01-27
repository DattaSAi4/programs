package FileHandling_p;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
	static String s1;
	public static void main(String[] args) throws IOException
	{   //create the file
		s1 ="simplelearn.ex";
		File f1 = new File(s1);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The file had created succusfully....");
		//write the file
		FileWriter  f2 = new  FileWriter(s1);
		f2.write("\nSimplelearn is the one best platform");
		f2.close();	
	    System.out.println("\nwrite the data into the file complete..");
	//read the file
	      File f3 = new File(s1);
	      Scanner s2 = new Scanner(f3);
	      System.out.println("\nRead the data from the file sucusss .......");
	      while(s2.hasNextLine())
	      {
	    	  System.out.println("----" +s2.nextLine()+"----");
	      }
	      System.out.println("read the data from the file sucusss .......");
	   //append the file 
	      String data ="\nThe Next Month is Feb ";
	       FileWriter  output = new FileWriter(s1,true);
	       output.write(data);
	       System.out.println( "\nappend the data to the existing file is succuess");
	       output.close();
	       
	      
	}	        

}

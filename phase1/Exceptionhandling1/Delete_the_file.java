package Exceptionhandling1;

import java.io.File;
import java.util.Scanner;

public class Delete_the_file {
	public static void main(String[] args)
	{
		System.out.println("enter the file");
		Scanner s1 = new Scanner(System.in);
		String filename = s1.nextLine();
		File f1 = new File(filename);
		if(f1.delete())
		{
			System.out.println("successfullydeleted");
		}
		else
		{
			System.out.println("fail to delete");
		}
		
	}

}

package Exceptionhandling1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_A_file {
	public static void main(String[] args) throws FileNotFoundException
	{
		File f1 = new File("sai.ex");
		Scanner s1 = new Scanner(f1);
		while(s1.hasNextLine())
		{
			System.out.println(s1.nextLine());
		}
		
	}

}

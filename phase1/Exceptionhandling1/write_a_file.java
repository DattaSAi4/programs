package Exceptionhandling1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class write_a_file {
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("vinay.exe");
	   String s1 = "sai.ex";
	   FileWriter f2 = new FileWriter(s1);
	   f2.write("Simplelearn");
	   f2.close();
	}

}

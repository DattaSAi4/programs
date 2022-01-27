package Exceptionhandling1;

import java.io.File;
import java.io.IOException;

public class create_A_file {
	public static void main(String[] args) throws IOException
	{
		   String directory = System.getProperty("user.dir");
		File f1 = new File(directory+"/sai.ex");
		f1.createNewFile();
	}

}

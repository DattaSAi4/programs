package Strings;

public class String_builder {
	public static void main(String[] args)
	{ //Stringbuilder
		String s1[] = {"datta","Sai","vinay"};
		 StringBuilder s2 = new StringBuilder();
		 s2.append(s1[0]);
		 s2.append(" "+s1[1]);
		 s2.append(" "+s1[2]);
		 System.out.println(s2.toString());
		 //Stringbuffer
		 String s52[] = {"vinay","sai","Datta"};
		 StringBuffer s3 = new  StringBuffer();
		 s3.append(s52[0]);
		 s3.append(" "+s52[1]);
		 s3.append(" "+s52[2]);
		 System.out.println(s3.toString());
		 
	}

}

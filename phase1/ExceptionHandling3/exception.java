package ExceptionHandling3;

public class exception extends Exception {
	
	        
	exception( String s1)
	{
		System.out.println(s1);
		
	}
	public static void main(String[] args)
	{
		try
		{ 
			System.out.println("start of try block");
			throw new exception("This is My error Message");
		}
		catch( Exception e)
		{
			System.out.println("end of try block");
		}
	}
	

}

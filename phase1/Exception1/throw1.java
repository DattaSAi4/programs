package Exception1;

public class throw1 {
	public static void main(String[] args)
	{
		int a=10,b=3,c;
		try
		{
		if(b==0)
		{
			throw(new ArithmeticException("cant divide by zero"));
		}
		else
		{
			c=a+b;
			System.out.println(c);
		}
		}
		catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException");	
		}
		System.out.println("end of the program");
	}

}

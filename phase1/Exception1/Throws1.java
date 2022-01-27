package Exception1;

class addition
{ 
	void add() throws ArithmeticException
	{
	int a=10,b=0,c;
	c=a/b;
	}

}
public class Throws1 
{
	public static void main(String[] args)
	{
		addition a1 = new addition();
		try
		{
	      a1.add();		
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException");
		}
		System.out.println("Arithmetic******Exception");
	}
}

package Exception1;

public class custumexception2 extends Exception {
	
	public custumexception2()
	{
		System.out.println("he is not eligible");
	}
	public custumexception2(String s1)
	{
		super(s1);
	}
	public static void main(String[] args) throws custumexception2
	{
		int a=20;
		try
		{
		if(a<18)
		{
			throw new custumexception2();
		}
		else
		{
			throw new custumexception2("eligilbe");
		}
	}
		catch(Exception e)
		{
			System.out.println("Athimetic Exception");
			}
		}
}

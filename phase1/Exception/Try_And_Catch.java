package Exception;
public class Try_And_Catch {
	public static void main(String[] args)
	{
		 int a[] = new int[10];
		try
		{
			 a[12] = 30;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally
		{
			System.out.println("The length of the Array" +a.length);
		}
	}

}

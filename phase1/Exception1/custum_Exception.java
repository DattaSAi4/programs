package Exception1;

class age extends Exception
{
	age()
	{
		super("underage");
	}
}
public class custum_Exception {
	public static void main(String[] args)  throws age
	{
		int age =17;
		if(age<18)
		{
			throw new age();
		}
	}
}
	



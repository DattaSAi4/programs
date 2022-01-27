package Oops;

class father
{
	String name ="vinay";
	public void car()
	{
		System.out.println("the car belongs to 1990");
	}
	}
class son extends father
{
	String name ="sai";
	}

public class inheritance {
	public static void main(String[] args)
	{
	son s1 = new son();
	s1.car();
	System.out.println(s1.name);
	     
	}	

}

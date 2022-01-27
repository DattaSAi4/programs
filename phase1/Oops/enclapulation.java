package Oops;

public class enclapulation {
	
	private int age;
	private String name;
	
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	public int setage( int newage)
	{
		age= newage;
		return age;
	}
	public String setname(String name1)
	{
		name= name1;
		return name;
	}
	public static void main(String[] args)
	{
		enclapulation e1 = new enclapulation();
		e1.setage(20);
		e1.setname("vinay");
		System.out.println(e1.getage());
		System.out.println(e1.getname());
	}

}

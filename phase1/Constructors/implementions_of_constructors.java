package Constructors;
//constructors implemention
public class implementions_of_constructors {
	
	int a;
	int b;
	implementions_of_constructors(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args)
	{
		implementions_of_constructors s1 = new implementions_of_constructors(10,20);
		System.out.println(s1.a);
		System.out.println(s1.b);
	}

}

package Arthimeticoperation;

public class a1 {
	public static void main(String[] args)
	{
		 add(10,20);
		 sub(20,10);
		 mul(2,5);
		 div(10,5);		 
		}
		static void add(int a, int b)
		{
			int c= a+b;
			System.out.println("The addition of two number"+c);
		}
		static void sub(int a ,int b)
		{
			int d = a-b;
			System.out.println("the substraction of two numbers" +d);
		}
		static void mul(int a, int b)
		{
			int e = a*b;
			System.out.println("The multiplication of two numbers"+e);
		}
		static void div(int a , int b)
		{
			int f = a/b;
			System.out.println("The division of two numbers"+f);
		}
}



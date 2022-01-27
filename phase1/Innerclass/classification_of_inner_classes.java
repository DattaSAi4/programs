package Innerclass;

public class classification_of_inner_classes {
	int a =40;
	int b =30;
	public void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	
	
	public class  bus
	{
		int a =10;
		int b =20;
		void add()
		{
			int c =a+b;
			System.out.println(c);
		}
	}
	public static void main(String[] args)
	{
		classification_of_inner_classes c1 = new classification_of_inner_classes();
		 System.out.println(c1.a);
		 System.out.println(c1.b);
                                          bus c2 = c1.new bus();
                                          System.out.println(c2.a);
                                          System.out.println(c2.b);
                                          c2.add();
                                          
	}

}

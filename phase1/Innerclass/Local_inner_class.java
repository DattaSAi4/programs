package Innerclass;

public class Local_inner_class {
	
	public void eat()
	{
		class local
		{
			int a =210;
			int b=300;
			void fruits()
			{
				System.out.println("eating..."); 
				}
		}
		  local c1 = new local();
		    c1.fruits();
		}
	
     public static void main(String[] args)
     {
    	 Local_inner_class l1 = new Local_inner_class();
    	 l1.eat();
     }
}

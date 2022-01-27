package Innerclass;


	
	interface  car
	{
		int a=10;
		 void eat();
		
	}
	public class inner_class {	
	public static void main(String[] args)
	{
		car c1 = new car(){
		
			public void eat() {
				System.out.println("nice fruits");	
			}
		};
		c1.eat();
	}
}

package Acccessmodifier;

public class accessmodifier {
	//public>default>protected>private
		//public---public can be access inside the class ,inside the
		//---------package and outside the package and subclase of different package
		//default--if we didnt mention we have to consider as default we can access inside the class as well
		//outside we cant access
		//protected---we can access inside and subclass of different package
		//private---we can access only in the class
		
		public static int a=10;
		protected static int b=20;
		static int c=30;
		private static int d=40;
		
		public static void valuea()
		{
			System.out.println(a);
		}
		protected static void valueb()
		{
			System.out.println(b);
		}
		 static void valuec()
		{
			System.out.println(c);
		}
		private static void valued()
		{
			System.out.println(d);
		}
		 public static void main(String[] args)
		 {
			 valuea();
			 valueb();
			 valuec();
			 valued();
			 
		 }
		
}

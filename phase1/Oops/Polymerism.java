package Oops;

public class Polymerism {
	int c;
	
	 public void add(int a , int b)
	 {
		 System.out.println(c=a+b);
	 }
	 public void add(double d ,double e,double f)
	 {
		 System.out.println(c= (int)(d+e+f));
	 }
	 public void add(double d , double e , double f,double g)
	 {
		 System.out.println(c = (int) (d+e+f+g));
	 }
	 public static void main(String[] args)
	 {
		 Polymerism p1 = new Polymerism();
		 p1.add(10, 29);
		 p1.add(10, 20,30);
		 p1.add(20.32, 30.11,30.0,40.3);
	 }

}

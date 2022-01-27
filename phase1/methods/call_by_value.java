package methods;
//call by value
public class call_by_value {
	private static int a=100;
	
	public  void add(int a) {
	int c=++a;
	}
	public static void main(String[] args)
	{
	call_by_value c1 = new call_by_value();
	System.out.println(call_by_value.a);
	c1.add(a);
	System.out.println(call_by_value.a);
	}

	
}

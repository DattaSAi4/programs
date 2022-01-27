package Thread2;
class multiplication implements Runnable
{

	@Override
	 synchronized  public void run() {
		int a = 10;
		int b=5;
		int c =a*b;
		System.out.println("The multiplication of" +a+ "and" +b+ "=" +c);
		if(a>b)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		System.out.println("yours operations are success");
		}
	}
  class   addition  implements Runnable
{
	@Override
	 synchronized  public void run() {
		 int a=30;
		 int b =20;
		 int c=a+b;
		 int d =a-b;
		 System.out.println("The Addition of" +a+ "and" +b+ "=" +c);
		 this.notifyAll();
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("The substraction of" +a+ "and" +b+ "=" +d);
		
	}
	
	}
public class Thread_methods {
	public static void main(String[] args)
	{
		multiplication m1 = new multiplication();
		addition a1 = new addition();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(a1);
		t1.start();
		t2.start();
		
	}
	
	

}
